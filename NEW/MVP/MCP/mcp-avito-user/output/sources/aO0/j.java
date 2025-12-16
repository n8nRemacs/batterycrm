package AO0;

import Oi0.C14701e;
import com.avito.android.visual_rubricator.B;
import com.avito.android.visual_rubricator.C;
import com.avito.android.visual_rubricator.C36111b;
import com.avito.android.visual_rubricator.C36119j;
import com.avito.android.visual_rubricator.C36121l;
import com.avito.android.visual_rubricator.C36124o;
import com.avito.android.visual_rubricator.C36129u;
import com.avito.android.visual_rubricator.F;
import com.avito.android.visual_rubricator.K;
import com.avito.android.visual_rubricator.Q;
import com.avito.android.visual_rubricator.ab.NewRubricatorAbTestGroup;
import com.avito.android.visual_rubricator.x;
import com.avito.android.visual_rubricator.y;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VisualRubricatorWidgetBlueprintFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAO0/j;", "LAO0/i;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f323a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<NewRubricatorAbTestGroup> f324b;

    @Inject
    public j(@Y61.k f fVar, @Y61.k u3.l lVar) {
        this.f323a = fVar;
        this.f324b = lVar;
    }

    @Override // AO0.i
    @Y61.k
    public final F a(@Y61.k Q q12, @Y61.k Il.i iVar, @Y61.k C14701e c14701e) {
        return new F(q12, iVar, this.f323a, new C(), c14701e, this.f324b.f439745a.f439749b.a());
    }

    @Override // AO0.i
    @Y61.k
    public final x b(@Y61.k Q q12, @Y61.k Il.i iVar, @Y61.k C14701e c14701e) {
        return new x(q12, iVar, this.f323a, new C36129u(), c14701e, this.f324b.f439745a.f439749b.a());
    }

    @Override // AO0.i
    @Y61.k
    public final C36124o c(@Y61.k Q q12, @Y61.k Il.i iVar, @Y61.k C14701e c14701e) {
        return new C36124o(q12, iVar, this.f323a, new C36121l(), c14701e, this.f324b.f439745a.f439749b.a());
    }

    @Override // AO0.i
    @Y61.k
    public final C36111b d(@Y61.k Q q12) {
        return new C36111b(q12);
    }

    @Override // AO0.i
    @Y61.k
    public final C36119j e(@Y61.k Q q12, @Y61.k Il.i iVar, @Y61.k C14701e c14701e) {
        return new C36119j(q12, iVar, this.f323a, new K(), c14701e, this.f324b.f439745a.f439749b.a());
    }

    @Override // AO0.i
    @Y61.k
    public final B f(@Y61.k Q q12, @Y61.k Il.i iVar, @Y61.k C14701e c14701e) {
        return new B(q12, iVar, this.f323a, new y(), c14701e, this.f324b.f439745a.f439749b.a());
    }
}
