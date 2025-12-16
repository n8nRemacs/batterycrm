package com.avito.android.publish.items;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.header.HeaderItem;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ThemedStep;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import xe0.InterfaceC49930a;

/* compiled from: PublishStepHeaderProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/f;", "Lcom/avito/android/publish/items/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC33675a f236796a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49930a f236797b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f236798c = C42727D.c(new a());

    /* compiled from: PublishStepHeaderProvider.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/conveyor_item/a;", "invoke", "()Lcom/avito/conveyor_item/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.conveyor_item.a> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final com.avito.conveyor_item.a invoke() {
            String strA;
            Integer num;
            Integer num2;
            f fVar = f.this;
            CategoryPublishStep categoryPublishStepA = fVar.f236796a.a();
            if (categoryPublishStepA == 0) {
                return null;
            }
            boolean z12 = categoryPublishStepA instanceof CategoryPublishStep.Params;
            if (z12) {
                CategoryPublishStep.Params.Config config = ((CategoryPublishStep.Params) categoryPublishStepA).getConfig();
                if ((config != null ? config.getHeaderStyle() : null) == CategoryPublishStep.Params.HeaderStyle.COMPACT) {
                    return null;
                }
            }
            if (z12) {
                CategoryPublishStep.Params params = (CategoryPublishStep.Params) categoryPublishStepA;
                CategoryPublishStep.Params.Config config2 = params.getConfig();
                Integer headerTopOffsetDp = config2 != null ? config2.getHeaderTopOffsetDp() : null;
                CategoryPublishStep.Params.Config config3 = params.getConfig();
                Integer headerBottomOffsetDp = config3 != null ? config3.getHeaderBottomOffsetDp() : null;
                CategoryPublishStep.Params.Config config4 = params.getConfig();
                String badgeOnceShowId = config4 != null ? config4.getBadgeOnceShowId() : null;
                CategoryPublishStep.Params.Config config5 = params.getConfig();
                strA = fVar.f236797b.a(badgeOnceShowId, config5 != null ? config5.getBadgeText() : null);
                num = headerTopOffsetDp;
                num2 = headerBottomOffsetDp;
            } else {
                strA = null;
                num = null;
                num2 = null;
            }
            ThemedStep themedStep = categoryPublishStepA instanceof ThemedStep ? (ThemedStep) categoryPublishStepA : null;
            return new HeaderItem(categoryPublishStepA.getId(), categoryPublishStepA.getTitle(), categoryPublishStepA.getSubtitle(), strA, false, num, num2, (SectionSeparatorSlotConfig.Tooltip) null, themedStep != null ? themedStep.getTheme() : null, false, 656, (C42822w) null);
        }
    }

    @Inject
    public f(@k InterfaceC33675a interfaceC33675a, @k InterfaceC49930a interfaceC49930a) {
        this.f236796a = interfaceC33675a;
        this.f236797b = interfaceC49930a;
    }

    @Override // com.avito.android.publish.items.e
    @l
    public final com.avito.conveyor_item.a a() {
        return (com.avito.conveyor_item.a) this.f236798c.getValue();
    }
}
