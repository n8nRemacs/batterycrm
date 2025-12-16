package com.vk.api.sdk.internal;

import Y61.k;
import com.vk.api.sdk.utils.i;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: QueryStringGenerator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/internal/f;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f366624a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f366625b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final i f366626c;

    /* compiled from: QueryStringGenerator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n"}, d2 = {"<anonymous>", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends N implements Y41.a<StringBuilder> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f366627l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final StringBuilder invoke() {
            return new StringBuilder();
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f366625b = new n[]{n0Var.i(new h0(n0Var.b(f.class), "strBuilder", "getStrBuilder()Ljava/lang/StringBuilder;"))};
        f366624a = new f();
        f366626c = new i(a.f366627l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StringBuilder a() {
        n<Object> nVar = f366625b[0];
        return (StringBuilder) f366626c.f366733b.get();
    }
}
