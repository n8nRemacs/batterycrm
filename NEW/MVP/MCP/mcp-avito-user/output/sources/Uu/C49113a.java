package uu;

import Y61.k;
import kotlin.Metadata;

/* compiled from: SharedPreferencesTable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luu/a;", "", "<init>", "()V", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49113a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f440317a = "CREATE TABLE IF NOT EXISTS shared_preferences (_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, file TEXT NOT NULL, key TEXT NOT NULL, value TEXT, type TEXT NOT NULL, UNIQUE (key, file))";

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440318b = "key = ? AND file = ?";

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f440319c = "SELECT value FROM shared_preferences WHERE key = ? AND file = ?";

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f440320d = "SELECT * FROM shared_preferences WHERE file = ?";

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f440321e = "file = ?";
}
