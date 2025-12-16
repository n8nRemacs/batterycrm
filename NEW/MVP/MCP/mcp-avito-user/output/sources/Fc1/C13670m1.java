package Fc1;

import com.android.volley.VolleyError;
import com.android.volley.w;
import kotlin.Z;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Fc1.m1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C13670m1 implements w.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5668b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f5669c;

    public /* synthetic */ C13670m1(kotlinx.coroutines.r rVar, int i12) {
        this.f5668b = i12;
        this.f5669c = rVar;
    }

    @Override // com.android.volley.w.a
    public final void a(VolleyError volleyError) {
        kotlinx.coroutines.r rVar = this.f5669c;
        switch (this.f5668b) {
            case 0:
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(new Z.b(volleyError));
                break;
            default:
                int i13 = kotlin.Z.f406624c;
                rVar.resumeWith(new Z.b(volleyError));
                break;
        }
    }
}
