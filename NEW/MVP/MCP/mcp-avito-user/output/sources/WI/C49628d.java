package wi;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;

/* compiled from: TabContainerTabsSetting.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Lwi/d;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "_style", "<init>", "(Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;)V", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wi.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49628d implements TabsScreenModel.d {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final BeduinTabStyle _style;

    /* compiled from: TabContainerTabsSetting.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi/d$a;", "Lwi/e;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wi.d$a */
    public static final class a implements InterfaceC49629e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f441753a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final kotlin.reflect.d<C49628d> f441754b = m0.f406844a.b(C49628d.class);

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f441755c = "tabContainer";

        @Override // wi.InterfaceC49629e
        @k
        public final String getType() {
            return f441755c;
        }

        @Override // wi.InterfaceC49629e
        @k
        public final kotlin.reflect.d<C49628d> getValue() {
            return f441754b;
        }
    }

    public C49628d(@l BeduinTabStyle beduinTabStyle) {
        this._style = beduinTabStyle;
    }

    @k
    public final BeduinTabStyle a() {
        BeduinTabStyle beduinTabStyle = this._style;
        return beduinTabStyle == null ? BeduinTabStyle.AVITO_TABS : beduinTabStyle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49628d) && this._style == ((C49628d) obj)._style;
    }

    public final int hashCode() {
        BeduinTabStyle beduinTabStyle = this._style;
        if (beduinTabStyle == null) {
            return 0;
        }
        return beduinTabStyle.hashCode();
    }

    @k
    public final String toString() {
        return "TabContainerTabsSetting(_style=" + this._style + ')';
    }
}
