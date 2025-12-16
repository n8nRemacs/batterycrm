package com.vk.api.sdk.utils;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.text.C43066x;

/* compiled from: VKUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/vk/api/sdk/utils/n;", "", "<init>", "()V", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final n f366742a = new n();

    /* compiled from: VKUtils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/utils/n$a;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f366743a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f366744b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final char[] f366745c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final i f366746d;

        /* compiled from: VKUtils.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002H\n"}, d2 = {"<anonymous>", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.vk.api.sdk.utils.n$a$a, reason: collision with other inner class name */
        public static final class C10821a extends N implements Y41.a<StringBuilder> {

            /* renamed from: l, reason: collision with root package name */
            public static final C10821a f366747l = new C10821a();

            public C10821a() {
                super(0);
            }

            @Override // Y41.a
            public final StringBuilder invoke() {
                return new StringBuilder();
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f366744b = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(a.class), "tmpBuilder", "getTmpBuilder()Ljava/lang/StringBuilder;"))};
            f366743a = new a();
            f366745c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            f366746d = new i(C10821a.f366747l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static StringBuilder a() {
            kotlin.reflect.n<Object> nVar = f366744b[0];
            return (StringBuilder) f366746d.f366733b.get();
        }
    }

    @X41.n
    @Y61.l
    public static final HashMap a(@Y61.l String str) {
        if (str == null) {
            return null;
        }
        List listF0 = C43066x.f0(str, new String[]{ContainerUtils.FIELD_DELIMITER}, 0, 6);
        HashMap map = new HashMap(listF0.size());
        Iterator it = listF0.iterator();
        while (it.hasNext()) {
            List listF02 = C43066x.f0((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, 0, 6);
            if (listF02.size() > 1) {
                map.put(listF02.get(0), listF02.get(1));
            }
        }
        return map;
    }
}
