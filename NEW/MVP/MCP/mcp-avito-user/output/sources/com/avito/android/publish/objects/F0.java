package com.avito.android.publish.objects;

import com.avito.android.publish.details.C33789t;
import kotlin.Metadata;

/* compiled from: ObjectFillFormViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/imv/a;", "data", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/imv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class F0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33975x f237478b;

    public F0(C33975x c33975x) {
        this.f237478b = c33975x;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.publish.imv.a aVar = (com.avito.android.publish.imv.a) obj;
        C33789t c33789t = this.f237478b.f238129d0;
        if (c33789t != null) {
            c33789t.q(aVar);
        }
    }
}
