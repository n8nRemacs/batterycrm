package yO0;

import Y61.k;
import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.visual_rubricator.ab.NewRubricatorAbTestGroup;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import u3.l;
import xO0.C49870a;
import xO0.InterfaceC49871b;

/* compiled from: RubricatorAbTestsImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyO0/a;", "LxO0/b;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yO0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50153a implements InterfaceC49871b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC27642e f443087a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f443088b;

    @Inject
    public C50153a(@k InterfaceC27642e interfaceC27642e, @k c0 c0Var) {
        this.f443087a = interfaceC27642e;
        this.f443088b = c0Var;
    }

    @Override // xO0.InterfaceC49871b
    @k
    public final l<NewRubricatorAbTestGroup> n7() {
        return new l<>(this.f443087a.c(new C49870a()), this.f443088b);
    }
}
