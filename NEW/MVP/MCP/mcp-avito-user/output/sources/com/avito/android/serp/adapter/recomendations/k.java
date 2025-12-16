package com.avito.android.serp.adapter.recomendations;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.Kundle;
import java.io.Serializable;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableSectionStateHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/recomendations/k;", "Lcom/avito/android/serp/adapter/recomendations/j;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public HashMap<String, Boolean> f270560a = new HashMap<>();

    /* compiled from: ExpandableSectionStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/recomendations/k$a;", "", "<init>", "()V", "", "STATE_KUNDLE_KEY", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public k() {
    }

    @Override // com.avito.android.serp.adapter.recomendations.j
    public final void a(@Y61.k String str, boolean z12) {
        this.f270560a.put(str, Boolean.valueOf(z12));
    }

    @Override // com.avito.android.serp.adapter.recomendations.j
    @Y61.l
    public final Boolean b(@Y61.l String str) {
        return this.f270560a.get(str);
    }

    @Override // com.avito.android.serp.adapter.recomendations.j
    public final void f0(@Y61.k Kundle kundle) {
        Object obj;
        Bundle bundle = kundle.f318647b;
        if (bundle.containsKey("state_kundle_key")) {
            try {
                obj = (Serializable) bundle.get("state_kundle_key");
            } catch (ClassCastException unused) {
            }
        } else {
            obj = null;
        }
        HashMap<String, Boolean> map = obj instanceof HashMap ? (HashMap) obj : null;
        if (map != null) {
            this.f270560a = map;
        }
    }

    @Override // com.avito.android.serp.adapter.recomendations.j
    @Y61.k
    public final Kundle l1() {
        Kundle kundle = new Kundle();
        HashMap<String, Boolean> map = this.f270560a;
        Bundle bundle = kundle.f318647b;
        if (map == null) {
            bundle.remove("state_kundle_key");
        } else {
            bundle.putSerializable("state_kundle_key", map);
        }
        return kundle;
    }
}
