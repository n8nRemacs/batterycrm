package com.avito.android.advertising.kebab;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;

/* compiled from: HiddenAdStorage.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/kebab/j;", "Lcom/avito/android/advertising/kebab/i;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f87838a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashSet<Integer> f87839b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashSet<String> f87840c = new HashSet<>();

    @Inject
    public j(@Y61.k AK0.l lVar) {
        this.f87838a = lVar;
    }

    @Override // com.avito.android.advertising.kebab.i
    public final void a(int i12) {
        String[] strArr;
        AK0.l lVar = this.f87838a;
        Set<String> setF = lVar.f("creative_id");
        if (setF == null || (strArr = (String[]) setF.toArray(new String[0])) == null) {
            strArr = new String[0];
        }
        t0 t0Var = new t0(2);
        t0Var.b(strArr);
        t0Var.a(String.valueOf(i12));
        ArrayList<Object> arrayList = t0Var.f406850a;
        lVar.putStringSet("creative_id", C42756l.l0(arrayList.toArray(new String[arrayList.size()])));
    }

    @Override // com.avito.android.advertising.kebab.i
    public final boolean b(@Y61.k String str) {
        return this.f87840c.contains(str);
    }

    @Override // com.avito.android.advertising.kebab.i
    public final void c(@Y61.k String str) {
        this.f87840c.add(str);
    }

    @Override // com.avito.android.advertising.kebab.i
    public final void d(int i12) {
        this.f87839b.add(Integer.valueOf(i12));
    }

    @Override // com.avito.android.advertising.kebab.i
    public final boolean e(int i12) {
        if (this.f87839b.contains(Integer.valueOf(i12))) {
            return true;
        }
        Set<String> setF = this.f87838a.f("creative_id");
        if (setF != null) {
            return setF.contains(String.valueOf(i12));
        }
        return false;
    }
}
