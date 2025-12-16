package androidx.datastore.migrations;

import Y61.k;
import Y61.l;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: SharedPreferencesMigration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/migrations/d;", "", "datastore_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SharedPreferences f45542a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final LinkedHashSet f45543b;

    public d(@k SharedPreferences sharedPreferences, @l LinkedHashSet linkedHashSet) {
        this.f45542a = sharedPreferences;
        this.f45543b = linkedHashSet;
    }
}
