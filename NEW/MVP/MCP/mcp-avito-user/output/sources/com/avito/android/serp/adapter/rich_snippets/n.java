package com.avito.android.serp.adapter.rich_snippets;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RichSnippetsResourceProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/n;", "Lcom/avito/android/serp/adapter/rich_snippets/m;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f270885a;

    @Inject
    public n(@Y61.k Resources resources) {
        this.f270885a = resources;
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.m
    public final int a() {
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        return this.f270885a.getColor(R.color.legacy_red, null);
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.m
    @Y61.k
    public final String b() {
        return this.f270885a.getString(R.string.call);
    }
}
