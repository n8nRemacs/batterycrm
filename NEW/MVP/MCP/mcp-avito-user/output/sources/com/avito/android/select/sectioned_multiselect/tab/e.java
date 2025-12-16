package com.avito.android.select.sectioned_multiselect.tab;

import Yp0.AbstractC18314a;
import com.avito.android.R;
import com.avito.android.util.V2;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectTabPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f266771b;

    public e(n nVar) {
        this.f266771b = nVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        n nVar = this.f266771b;
        ArrayList arrayListC = nVar.c();
        if (nVar.f266785f.getF266527T() != null) {
            arrayListC.add(new AbstractC18314a.C1404a(nVar.f266790k.f266514a.getString(R.string.pagination_error_action_repeat)));
        }
        t tVar = nVar.f266791l;
        if (tVar != null) {
            tVar.a(arrayListC);
        }
        V2.f318762a.a("DEFAULT_TAG", "Failed to load page", th2);
    }
}
