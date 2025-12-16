package com.avito.android.vas_planning.domain;

import com.avito.android.R;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: VasPlanningInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "verified", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f322348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f322349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f322350d;

    public p(l lVar, ArrayList arrayList, String str) {
        this.f322348b = lVar;
        this.f322349c = arrayList;
        this.f322350d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        l lVar = this.f322348b;
        if (!zBooleanValue) {
            return z.c0(new P2.a(com.avito.android.remote.error.j.a(2, lVar.f322339f.getString(R.string.vas_planning_time_picker_incorrent), null)));
        }
        h hVar = lVar.f322337d;
        ArrayList arrayList = this.f322349c;
        return hVar.a(arrayList, true).p(new o(lVar, arrayList, this.f322350d));
    }
}
