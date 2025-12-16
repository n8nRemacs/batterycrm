package com.avito.android.calltracking;

import android.content.res.Resources;
import android.util.TypedValue;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CalltrackingResourceProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/calltracking/G;", "Lcom/avito/android/calltracking/F;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f113574a;

    @Inject
    public G(@Y61.k Resources resources) {
        this.f113574a = resources;
    }

    @Override // com.avito.android.calltracking.F
    public final int a() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f113574a.getColor(R.color.red, null);
    }

    @Override // com.avito.android.calltracking.F
    public final int b() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f113574a.getColor(R.color.gray54, null);
    }
}
