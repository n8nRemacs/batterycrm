package Je0;

import Ie0.InterfaceC14065a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.InterfaceC33761j0;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PublishDetailsManagerCompat.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LJe0/a;", "Lcom/avito/android/publish/details/b;", "Lcom/avito/android/publish/details/j0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Je0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14190a implements InterfaceC33678b, InterfaceC33761j0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PublishDetailsFragment f9078b;

    public C14190a(@k PublishDetailsFragment publishDetailsFragment) {
        this.f9078b = publishDetailsFragment;
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void B9(@k PublishDetailsFlowTracker.FlowContext... flowContextArr) {
        this.f9078b.t5(new InterfaceC14065a.d.C14076c(flowContextArr));
    }

    @Override // com.avito.android.publish.details.InterfaceC33761j0
    public final void C(@k l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar) {
        this.f9078b.t5(new InterfaceC14065a.d.m(lVar));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    @k
    public final List<com.avito.conveyor_item.a> Ha(@k UV0.a<ParameterSlot> aVar, @k PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        return this.f9078b.v5().f240410N.Ha(aVar, flowContextArr);
    }

    @Override // com.avito.android.publish.items.video_upload.a
    public final void I8(@Y61.l Y41.a aVar, boolean z12) {
        this.f9078b.t5(new InterfaceC14065a.d.D(aVar, z12));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void J5(@k JO.a aVar) {
        this.f9078b.t5(new InterfaceC14065a.d.p(aVar));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void Mb(@k com.avito.conveyor_item.a aVar) {
        this.f9078b.t5(new InterfaceC14065a.d.n(aVar));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void V8(@k String str) {
        this.f9078b.t5(new InterfaceC14065a.d.y(str));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void e7() {
        this.f9078b.t5(InterfaceC14065a.d.q.f8317a);
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b, Xd0.d
    public final void l(@Y61.l String str) {
        this.f9078b.t5(new InterfaceC14065a.d.k(str));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void v3(boolean z12) {
        this.f9078b.t5(new InterfaceC14065a.d.C0475d(z12 ? k.b.f243161a : null));
    }

    @Override // com.avito.android.publish.details.InterfaceC33678b
    public final void x4(@Y61.k Set<String> set, @Y61.k l<? super Boolean, G0> lVar) {
        this.f9078b.t5(new InterfaceC14065a.d.B(set, lVar));
    }

    @Override // com.avito.android.publish.items.video_upload.a
    public final void z4(boolean z12) {
        this.f9078b.t5(new InterfaceC14065a.d.C(z12));
    }
}
