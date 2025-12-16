package com.avito.android.publish.screen.step.select.loader;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.blueprints.publish.header.HeaderItem;
import com.avito.android.publish.details.InterfaceC33675a;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.HasSubtitle;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectStepHeaderProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/select/loader/e;", "Lcom/avito/android/publish/screen/step/select/loader/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC33675a f242182a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f242183b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f242184c = C42727D.c(new a());

    /* compiled from: SelectStepHeaderProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/conveyor_item/a;", "invoke", "()Lcom/avito/conveyor_item/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.avito.conveyor_item.a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.conveyor_item.a invoke() {
            e eVar = e.this;
            CategoryPublishStep categoryPublishStepA = eVar.f242182a.a();
            ParametersTree parametersTreeWa = eVar.f242183b.wa();
            HasError hasError = parametersTreeWa != null ? (SelectParameter) parametersTreeWa.getFirstParameterOfType(SelectParameter.class) : null;
            if (categoryPublishStepA == null || hasError == null) {
                return null;
            }
            HasSubtitle hasSubtitle = hasError instanceof HasSubtitle ? (HasSubtitle) hasError : null;
            AttributedText subtitle = hasSubtitle != null ? hasSubtitle.getSubtitle() : null;
            return subtitle != null ? new HeaderItem(categoryPublishStepA.getId(), categoryPublishStepA.getTitle(), subtitle, (String) null, false, (Integer) null, (Integer) null, (SectionSeparatorSlotConfig.Tooltip) null, (Theme) null, (Boolean) null, false, 2040, (C42822w) null) : new HeaderItem(categoryPublishStepA.getId(), categoryPublishStepA.getTitle(), categoryPublishStepA.getSubtitle(), (String) null, false, (Integer) null, (Integer) null, (SectionSeparatorSlotConfig.Tooltip) null, (Theme) null, false, 1016, (C42822w) null);
        }
    }

    @Inject
    public e(@k InterfaceC33675a interfaceC33675a, @k com.avito.android.details.a aVar) {
        this.f242182a = interfaceC33675a;
        this.f242183b = aVar;
    }

    @Override // com.avito.android.publish.items.e
    @l
    public final com.avito.conveyor_item.a a() {
        return (com.avito.conveyor_item.a) this.f242184c.getValue();
    }
}
