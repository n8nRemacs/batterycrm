package com.avito.android.scroll_tracker;

import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: SnippetViewingDepthTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/scroll_tracker/i;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {

    /* compiled from: SnippetViewingDepthTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/scroll_tracker/i$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public LinkedHashMap f261724a = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public LinkedHashSet f261725b = new LinkedHashSet();
    }

    void a();

    void b();

    void c(@Y61.k a aVar);

    boolean d();

    void e(@Y61.k com.avito.conveyor_item.a aVar);

    @Y61.k
    ArrayList f();
}
