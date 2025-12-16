package io.ktor.http.content;

import io.ktor.http.T;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Multipart.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/ktor/http/content/t;", "", "a", "b", "c", "d", "Lio/ktor/http/content/t$a;", "Lio/ktor/http/content/t$b;", "Lio/ktor/http/content/t$c;", "Lio/ktor/http/content/t$d;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f399985a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f399986b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f399987c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Object f399988d;

    /* compiled from: Multipart.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/t$a;", "Lio/ktor/http/content/t;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends t {
    }

    /* compiled from: Multipart.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/t$b;", "Lio/ktor/http/content/t;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends t {
    }

    /* compiled from: Multipart.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/t$c;", "Lio/ktor/http/content/t;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends t {
    }

    /* compiled from: Multipart.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/t$d;", "Lio/ktor/http/content/t;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends t {
    }

    public t() {
        throw null;
    }

    public t(Y41.a aVar, T t12, C42822w c42822w) {
        this.f399985a = aVar;
        this.f399986b = t12;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f399987c = C42727D.b(lazyThreadSafetyMode, new u(this));
        this.f399988d = C42727D.b(lazyThreadSafetyMode, new v(this));
    }
}
