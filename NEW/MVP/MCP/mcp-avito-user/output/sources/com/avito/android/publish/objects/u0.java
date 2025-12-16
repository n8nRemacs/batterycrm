package com.avito.android.publish.objects;

import com.avito.android.blueprints.job_suggest.c;
import com.avito.android.suggest_institutes_bottom_sheet.SuggestInstituteArguments;
import kotlin.Metadata;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/blueprints/job_suggest/c$a;", "clickEvent", "Lkotlin/G0;", "accept", "(Lcom/avito/android/blueprints/job_suggest/c$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class u0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33975x f238103b;

    public u0(C33975x c33975x) {
        this.f238103b = c33975x;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        c.a aVar = (c.a) obj;
        SuggestInstituteArguments suggestInstituteArguments = new SuggestInstituteArguments(aVar.f106043a, aVar.f106044b, aVar.f106045c);
        ObjectFillFormFragment objectFillFormFragment = this.f238103b.f238130e0;
        if (objectFillFormFragment != null) {
            com.avito.android.suggest_institutes_bottom_sheet.a aVar2 = objectFillFormFragment.f237538J0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            aVar2.a(suggestInstituteArguments).show(objectFillFormFragment.getParentFragmentManager(), (String) null);
        }
    }
}
