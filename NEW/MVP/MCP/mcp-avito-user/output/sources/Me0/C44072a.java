package me0;

import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InputVinResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lme0/a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: me0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44072a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f414653a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414655c;

    @Inject
    public C44072a(@k Resources resources) {
        this.f414653a = resources.getString(R.string.fix_errors);
        this.f414654b = resources.getString(R.string.has_finish_on_flow_warnings);
        this.f414655c = resources.getString(R.string.connection_problem);
    }
}
