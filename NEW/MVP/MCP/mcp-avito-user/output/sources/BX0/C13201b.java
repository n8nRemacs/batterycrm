package Bx0;

import AK0.l;
import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.M;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: CvUploadPreferencesImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBx0/b;", "LBx0/a;", "_avito_job_cv-upload_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bx0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13201b implements InterfaceC13200a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f1818a;

    @Inject
    public C13201b(@k l lVar) {
        this.f1818a = lVar;
    }

    @Override // Bx0.InterfaceC13200a
    @k
    public final M a(@k String str) {
        Set<String> setF = this.f1818a.f("key_cv_was_uploaded");
        return I.q(Boolean.valueOf(setF != null ? setF.contains(str) : false));
    }

    @Override // Bx0.InterfaceC13200a
    public final void b(@k String str) {
        G0 g02;
        l lVar = this.f1818a;
        Set<String> setF = lVar.f("key_cv_was_uploaded");
        if (setF != null) {
            lVar.putStringSet("key_cv_was_uploaded", b1.i(setF, str));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            lVar.putStringSet("key_cv_was_uploaded", Collections.singleton(str));
        }
    }

    @Override // Bx0.InterfaceC13200a
    public final void c(@k String str) {
        l lVar = this.f1818a;
        Set<String> setF = lVar.f("key_cv_was_uploaded");
        if (setF == null || !setF.contains(str)) {
            return;
        }
        lVar.putStringSet("key_cv_was_uploaded", b1.e(setF, str));
    }
}
