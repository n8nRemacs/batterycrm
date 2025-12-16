package s3;

import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import u3.AbstractC48780d;

/* compiled from: NewCameraTestConfig.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls3/I;", "Lu3/d;", "Lcom/avito/android/ab_tests/groups/SimpleTestGroupWithNone;", "_avito-discouraged_avito-feature_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I extends AbstractC48780d<SimpleTestGroupWithNone> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q1 f437333a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437334b = "sellerx_photo_picker_camera_new_design_android";

    /* renamed from: c, reason: collision with root package name */
    public final boolean f437335c;

    public I(@Y61.k Q1 q12) {
        this.f437333a = q12;
        Owners owners = Owners.f210476d;
        this.f437335c = true;
    }

    @Override // u3.InterfaceC48778b
    /* renamed from: a, reason: from getter */
    public final boolean getF437335c() {
        return this.f437335c;
    }

    @Override // u3.InterfaceC48778b
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getF437334b() {
        return this.f437334b;
    }

    @Override // u3.AbstractC48780d
    public final u3.j c() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final u3.j[] e() {
        return SimpleTestGroupWithNone.values();
    }

    @Override // u3.AbstractC48780d
    public final u3.j f() {
        return SimpleTestGroupWithNone.f67969c;
    }

    @Override // u3.AbstractC48780d
    public final boolean g() {
        Q1 q12 = this.f437333a;
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[24];
        return ((Boolean) q12.f67522z.a().invoke()).booleanValue();
    }
}
