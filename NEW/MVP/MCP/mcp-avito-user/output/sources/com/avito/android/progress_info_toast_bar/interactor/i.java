package com.avito.android.progress_info_toast_bar.interactor;

import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.f2;

/* compiled from: VacancyResponseCompletedManagerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/interactor/i;", "Lcom/avito/android/progress_info_toast_bar/interactor/g;", "Lcom/avito/android/progress_info_toast_bar/interactor/a;", "<init>", "()V", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes16.dex */
public final class i implements g, a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f231540a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f231541b = new LinkedHashMap();

    @Inject
    public i() {
    }

    @Override // com.avito.android.progress_info_toast_bar.interactor.g
    public final void a(@Y61.k String str, @Y61.k String str2) {
        LinkedHashMap linkedHashMap = this.f231540a;
        if (!linkedHashMap.containsKey(str2)) {
            linkedHashMap.put(str2, b1.g(str));
            return;
        }
        Set set = (Set) linkedHashMap.get(str2);
        if (set != null) {
            set.add(str);
        }
    }

    @Override // com.avito.android.progress_info_toast_bar.interactor.g
    @Y61.k
    public final X b(@Y61.k String str) {
        LinkedHashMap linkedHashMap = this.f231541b;
        Object objB = linkedHashMap.get(str);
        if (objB == null) {
            objB = f2.b(0, 1, BufferOverflow.f410778c, 1);
            linkedHashMap.put(str, objB);
        }
        return new X(C43175k.a((Y1) objB), new h(this, str, null));
    }

    @Override // com.avito.android.progress_info_toast_bar.interactor.a
    public final void c(@Y61.k String str) {
        LinkedHashMap linkedHashMap = this.f231540a;
        for (String str2 : C42745f0.q0(linkedHashMap.keySet())) {
            Set set = (Set) linkedHashMap.get(str2);
            if (set != null && set.remove(str)) {
                Y1 y12 = (Y1) this.f231541b.get(str2);
                if (y12 != null) {
                    y12.K5(str);
                    return;
                }
                return;
            }
        }
    }
}
