package androidx.room;

import Z1.e;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: DatabaseConfiguration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/C;", "", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Context f54232a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final String f54233b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final e.c f54234c;

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final RoomDatabase.d f54235d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final ArrayList f54236e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    public final boolean f54237f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final RoomDatabase.JournalMode f54238g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Executor f54239h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Executor f54240i;

    /* renamed from: j, reason: collision with root package name */
    @X41.f
    public final boolean f54241j;

    /* renamed from: k, reason: collision with root package name */
    @X41.f
    public final boolean f54242k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final LinkedHashSet f54243l;

    /* renamed from: m, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final ArrayList f54244m;

    /* renamed from: n, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final ArrayList f54245n;

    @SuppressLint({"LambdaLast"})
    @RestrictTo
    public C(@Y61.k Context context, @Y61.l String str, @Y61.k e.c cVar, @Y61.k RoomDatabase.d dVar, @Y61.l ArrayList arrayList, boolean z12, @Y61.k RoomDatabase.JournalMode journalMode, @Y61.k Executor executor, @Y61.k Executor executor2, boolean z13, boolean z14, @Y61.l LinkedHashSet linkedHashSet, @Y61.k ArrayList arrayList2, @Y61.k ArrayList arrayList3) {
        this.f54232a = context;
        this.f54233b = str;
        this.f54234c = cVar;
        this.f54235d = dVar;
        this.f54236e = arrayList;
        this.f54237f = z12;
        this.f54238g = journalMode;
        this.f54239h = executor;
        this.f54240i = executor2;
        this.f54241j = z13;
        this.f54242k = z14;
        this.f54243l = linkedHashSet;
        this.f54244m = arrayList2;
        this.f54245n = arrayList3;
    }
}
