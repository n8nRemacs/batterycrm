package Q91;

import androidx.view.M0;
import com.avito.android.R;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* loaded from: classes9.dex */
public final class f extends M0 {

    /* renamed from: E, reason: collision with root package name */
    public final n2 f13584E;

    public f(P91.b bVar) {
        Z1 z1A = p2.a(new e());
        this.f13584E = C43175k.b(z1A);
        P91.e eVar = bVar.f12872a;
        boolean zA2 = eVar != null ? P91.d.a(eVar.f12874b) : false;
        ru.mts.biometry.sdk.feature.document.intro.domain.d dVar = eVar != null ? eVar.f12874b : null;
        int i12 = dVar == null ? -1 : P91.a.f12871a[dVar.ordinal()];
        int i13 = R.string.sdk_bio_empty_string;
        int i14 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? R.string.sdk_bio_empty_string : R.string.sdk_bio_drvlic_intro_title : R.string.sdk_bio_idCard_intro_title : R.string.sdk_bio_russianForeignPassport_intro_title : R.string.sdk_bio_passport_intro_title;
        ru.mts.biometry.sdk.feature.document.intro.domain.d dVar2 = eVar != null ? eVar.f12874b : null;
        int i15 = dVar2 == null ? -1 : P91.a.f12871a[dVar2.ordinal()];
        int i16 = i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? R.string.sdk_bio_empty_string : R.array.sdk_bio_drvlic_intro_list_short : R.array.sdk_bio_idCard_intro_list_short : R.array.sdk_bio_russianForeignPassport_intro_list_short : R.array.sdk_bio_passport_intro_list_short;
        ru.mts.biometry.sdk.feature.document.intro.domain.d dVar3 = eVar != null ? eVar.f12874b : null;
        int i17 = dVar3 != null ? P91.a.f12871a[dVar3.ordinal()] : -1;
        if (i17 == 1) {
            i13 = R.array.sdk_bio_passport_intro_list_full;
        } else if (i17 == 2) {
            i13 = R.array.sdk_bio_russianForeignPassport_intro_list_full;
        } else if (i17 == 3) {
            i13 = R.array.sdk_bio_idCard_intro_list_full;
        } else if (i17 == 4) {
            i13 = R.array.sdk_bio_drvlic_intro_list_full;
        }
        z1A.setValue(new e(i14, i16, i13, zA2));
    }
}
