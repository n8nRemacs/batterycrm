package com.avito.android.scroll_tracker;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.i1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: SnippetScrollDepthTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/scroll_tracker/d;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d {

    /* compiled from: SnippetScrollDepthTracker.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/scroll_tracker/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public int f261715b;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public LinkedHashMap f261714a = new LinkedHashMap();

        /* renamed from: c, reason: collision with root package name */
        public int f261716c = -1;
    }

    void a();

    void b();

    void c(@Y61.k UV0.a<? extends i1> aVar);

    boolean d();

    void e(int i12);

    int f();

    int g();

    void h(@Y61.k a aVar);

    @Y61.k
    ArrayList i();
}
