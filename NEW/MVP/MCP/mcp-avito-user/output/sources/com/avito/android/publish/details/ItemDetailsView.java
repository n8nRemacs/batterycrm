package com.avito.android.publish.details;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.TooltipOptions;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ItemDetailsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/ItemDetailsView;", "", "b", "RightTopButtonStyle", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ItemDetailsView {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/ItemDetailsView$RightTopButtonStyle;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RightTopButtonStyle {

        /* renamed from: b, reason: collision with root package name */
        public static final RightTopButtonStyle f232948b;

        /* renamed from: c, reason: collision with root package name */
        public static final RightTopButtonStyle f232949c;

        /* renamed from: d, reason: collision with root package name */
        public static final RightTopButtonStyle f232950d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ RightTopButtonStyle[] f232951e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f232952f;

        static {
            RightTopButtonStyle rightTopButtonStyle = new RightTopButtonStyle("CLOSE", 0);
            f232948b = rightTopButtonStyle;
            RightTopButtonStyle rightTopButtonStyle2 = new RightTopButtonStyle("REMOVE", 1);
            f232949c = rightTopButtonStyle2;
            RightTopButtonStyle rightTopButtonStyle3 = new RightTopButtonStyle("NONE", 2);
            f232950d = rightTopButtonStyle3;
            RightTopButtonStyle[] rightTopButtonStyleArr = {rightTopButtonStyle, rightTopButtonStyle2, rightTopButtonStyle3};
            f232951e = rightTopButtonStyleArr;
            f232952f = kotlin.enums.c.a(rightTopButtonStyleArr);
        }

        public RightTopButtonStyle() {
            throw null;
        }

        public static RightTopButtonStyle valueOf(String str) {
            return (RightTopButtonStyle) Enum.valueOf(RightTopButtonStyle.class, str);
        }

        public static RightTopButtonStyle[] values() {
            return (RightTopButtonStyle[]) f232951e.clone();
        }
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ItemDetailsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/ItemDetailsView$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ItemDetailsView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar);

        void O5();

        void Zc(@Y61.k String str);

        void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill);

        void j2();

        void k2(boolean z12);

        void n(@Y61.k DeepLink deepLink);

        void nb();

        void s(@Y61.k BubbleInfo bubbleInfo);
    }

    void C0();

    void W();

    void a();

    void c(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2);

    void d(@Y61.k UV0.a<? extends com.avito.conveyor_item.a> aVar);

    void e(int i12, boolean z12);

    void f(@Y61.k ru.avito.component.toolbar.d dVar);

    void g();

    void h();

    void i();

    void j(int i12, @Y61.l TooltipOptions tooltipOptions, @Y61.l Y41.a<kotlin.G0> aVar);

    void j3(@Y61.k String str);

    void k(@Y61.k String str);

    void l();

    void q1();
}
