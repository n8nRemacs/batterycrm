package com.avito.android.beduin.common.component.selector_card_group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectorCardGroupOptionView.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fJ+\u0010\t\u001a\u00020\b2\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/k;", "Landroid/widget/FrameLayout;", "", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "components", "Lkotlin/G0;", "setComponents", "(Ljava/util/List;)V", "", "selected", "setSelected", "(Z)V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RelativeLayout f102548b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f102549c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f102550d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public BeduinSelectorCardGroupModel.SelectionDisplayType f102551e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.component.adapter.a f102552f;

    /* compiled from: BeduinSelectorCardGroupOptionView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/k$a;", "", "<init>", "()V", "", "INVALID_STATE_BORDER_WIDTH", "F", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinSelectorCardGroupOptionView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102553a;

        static {
            int[] iArr = new int[BeduinSelectorCardGroupModel.SelectionDisplayType.values().length];
            try {
                iArr[BeduinSelectorCardGroupModel.SelectionDisplayType.Border.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinSelectorCardGroupModel.SelectionDisplayType.Mark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinSelectorCardGroupModel.SelectionDisplayType.BorderAndMark.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f102553a = iArr;
        }
    }

    static {
        new a(null);
    }

    public k(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f102551e = BeduinSelectorCardGroupModel.SelectionDisplayType.BorderAndMark;
        com.avito.android.beduin.common.component.adapter.a aVar = new com.avito.android.beduin.common.component.adapter.a(0);
        this.f102552f = aVar;
        View.inflate(context, R.layout.beduin_component_selector_card_group_option, this);
        View viewFindViewById = findViewById(R.id.selector_card_group_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
        }
        this.f102548b = (RelativeLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.selector_card_group_option_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f102549c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.selector_card_group_option_components_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f102550d = recyclerView;
        recyclerView.setItemAnimator(null);
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView, aVar);
    }

    public final void setComponents(@Y61.k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> components) {
        this.f102552f.m(components);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSelected(boolean r2) {
        /*
            r1 = this;
            super.setSelected(r2)
            com.avito.android.beduin.common.component.selector_card_group.BeduinSelectorCardGroupModel$SelectionDisplayType r2 = r1.f102551e
            int[] r0 = com.avito.android.beduin.common.component.selector_card_group.k.b.f102553a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L26
            r0 = 2
            if (r2 == r0) goto L1d
            r0 = 3
            if (r2 != r0) goto L17
            goto L1d
        L17:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L1d:
            boolean r2 = r1.isSelected()
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 4
        L27:
            android.widget.ImageView r0 = r1.f102549c
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.selector_card_group.k.setSelected(boolean):void");
    }
}
