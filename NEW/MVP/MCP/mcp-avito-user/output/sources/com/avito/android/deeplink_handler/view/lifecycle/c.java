package com.avito.android.deeplink_handler.view.lifecycle;

import androidx.view.InterfaceC23040h0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47918a;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/u", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class c<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f134652b;

    public c(d dVar) {
        this.f134652b = dVar;
    }

    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != null) {
            d dVar = this.f134652b;
            io.reactivex.rxjava3.subjects.e<C47918a> eVar = dVar.f134654c;
            Iterator<T> it = ((List) t12).iterator();
            while (it.hasNext()) {
                eVar.onNext((C47918a) it.next());
            }
            dVar.f134653b.setValue(null);
        }
    }
}
