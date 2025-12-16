package W91;

import Ba1.y;
import android.os.Bundle;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.mts.biometry.sdk.feature.main.ui.BiometryActivity;

/* loaded from: classes9.dex */
public final class h implements Aa1.c {

    /* renamed from: a, reason: collision with root package name */
    public Aa1.d f17819a;

    /* renamed from: b, reason: collision with root package name */
    public int f17820b;

    /* renamed from: c, reason: collision with root package name */
    public BiometryActivity f17821c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f17822d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f17823e;

    public final void a() {
        c(new b());
    }

    public final void b(Aa1.d dVar) {
        BiometryActivity biometryActivity;
        this.f17820b = 0;
        this.f17819a = dVar;
        Fragment fragmentA = dVar.a(0, null);
        if (fragmentA == null || (biometryActivity = this.f17821c) == null) {
            return;
        }
        H hE2 = biometryActivity.getSupportFragmentManager().e();
        hE2.n(R.id.sdk_root_container, fragmentA, null);
        hE2.f46457p = true;
        hE2.f();
    }

    public final void c(f fVar) {
        Fragment fragmentA;
        BiometryActivity biometryActivity;
        BiometryActivity biometryActivity2 = this.f17821c;
        if (biometryActivity2 == null) {
            this.f17822d.add(fVar);
            return;
        }
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            Aa1.d dVar2 = this.f17819a;
            if (dVar2 == null) {
                return;
            }
            int i12 = this.f17820b + 1;
            this.f17820b = i12;
            if (i12 >= dVar2.a()) {
                Aa1.b.a(this, y.e());
                return;
            }
            int i13 = this.f17820b;
            Bundle bundle = dVar.f17816a;
            Fragment fragmentA2 = dVar2.a(i13, bundle);
            Bundle arguments = fragmentA2.getArguments();
            if (arguments == null) {
                arguments = C22777e.a();
            }
            if (bundle != null) {
                arguments.putAll(bundle);
            }
            fragmentA2.setArguments(arguments);
            H hE2 = biometryActivity2.getSupportFragmentManager().e();
            hE2.n(R.id.sdk_root_container, fragmentA2, null);
            hE2.f46457p = true;
            hE2.f();
            return;
        }
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            String str = eVar.f17818b;
            if (str == null || biometryActivity2.getSupportFragmentManager().H(str) == null) {
                H hE3 = biometryActivity2.getSupportFragmentManager().e();
                hE3.n(R.id.sdk_root_container, eVar.f17817a, str);
                hE3.f46457p = true;
                hE3.c(null);
                hE3.e();
                return;
            }
            return;
        }
        if (!(fVar instanceof b)) {
            if (fVar instanceof c) {
                c cVar = (c) fVar;
                h hVar = biometryActivity2.f436468c;
                if ((hVar != null ? hVar : null).f17823e) {
                    return;
                }
                if (cVar.f17815a) {
                    biometryActivity2.a();
                    return;
                } else {
                    biometryActivity2.setResult(11);
                    biometryActivity2.finish();
                    return;
                }
            }
            return;
        }
        if (this.f17823e) {
            return;
        }
        int i14 = this.f17820b;
        if (i14 == 0) {
            d(true);
            return;
        }
        int i15 = i14 > 1 ? i14 - 1 : 0;
        this.f17820b = i15;
        Aa1.d dVar3 = this.f17819a;
        if (dVar3 == null || (fragmentA = dVar3.a(i15, null)) == null || (biometryActivity = this.f17821c) == null) {
            return;
        }
        H hE4 = biometryActivity.getSupportFragmentManager().e();
        hE4.n(R.id.sdk_root_container, fragmentA, null);
        hE4.f46457p = true;
        hE4.f();
    }

    public final void d(boolean z12) {
        c(new c(z12));
    }
}
