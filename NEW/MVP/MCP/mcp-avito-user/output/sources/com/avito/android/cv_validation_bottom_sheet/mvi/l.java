package com.avito.android.cv_validation_bottom_sheet.mvi;

import com.avito.android.cv_validation_bottom_sheet.deeplink.CvForValidation;
import com.avito.android.cv_validation_bottom_sheet.list.CvItem;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import com.avito.android.di.module.C30125n4;
import dagger.internal.x;
import dagger.internal.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C42745f0;

/* compiled from: CvValidationBottomSheetFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final r f131907a;

    /* renamed from: b, reason: collision with root package name */
    public final i f131908b;

    /* renamed from: c, reason: collision with root package name */
    public final p f131909c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f131910d;

    /* renamed from: e, reason: collision with root package name */
    public final C30125n4 f131911e;

    public l(r rVar, i iVar, p pVar, dagger.internal.l lVar, C30125n4 c30125n4) {
        this.f131907a = rVar;
        this.f131908b = iVar;
        this.f131909c = pVar;
        this.f131910d = lVar;
        this.f131911e = c30125n4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        q qVar = (q) this.f131907a.get();
        h hVar = (h) this.f131908b.get();
        this.f131909c.getClass();
        o oVar = new o();
        CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams = (CvValidationBottomSheetOpenParams) this.f131910d.f393949a;
        com.avito.android.date_time_formatter.b bVar = (com.avito.android.date_time_formatter.b) this.f131911e.get();
        List<CvForValidation> list = cvValidationBottomSheetOpenParams.f131945b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (CvForValidation cvForValidation : list) {
            String str = cvForValidation.f131787b;
            String strA = bVar.a(Long.valueOf(cvForValidation.f131789d), TimeUnit.SECONDS);
            arrayList.add(new CvItem(cvForValidation.f131790e, str, cvForValidation.f131788c, strA));
        }
        return new k("CvValidationBottomSheet", new s(cvValidationBottomSheetOpenParams.f131946c, cvValidationBottomSheetOpenParams.f131947d, cvValidationBottomSheetOpenParams.f131948e, cvValidationBottomSheetOpenParams.f131949f, arrayList), new j(hVar, qVar, oVar));
    }
}
