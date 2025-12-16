package com.yandex.div.core.player;

import Y61.k;
import Y61.l;
import android.content.Context;
import kotlin.Metadata;

/* compiled from: DivPlayerFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/player/c;", "", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final a f367616a;

    /* compiled from: DivPlayerFactory.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/player/c$a", "Lcom/yandex/div/core/player/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements c {

        /* compiled from: DivPlayerFactory.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/core/player/c$a$a", "Lcom/yandex/div/core/player/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.core.player.c$a$a, reason: collision with other inner class name */
        public static final class C10860a extends e {
            @Override // com.yandex.div.core.player.e
            @l
            public /* bridge */ /* synthetic */ com.yandex.div.core.player.a getAttachedPlayer() {
                return null;
            }
        }

        @Override // com.yandex.div.core.player.c
        public final com.yandex.div.core.player.b a() {
            return new com.yandex.div.core.player.b();
        }

        @Override // com.yandex.div.core.player.c
        public final C10860a b(Context context) {
            return new C10860a(context, null, 0, 6, null);
        }
    }

    /* compiled from: DivPlayerFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/player/c$b;", "", "<init>", "()V", "Lcom/yandex/div/core/player/c;", "STUB", "Lcom/yandex/div/core/player/c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f367617a = 0;

        static {
            new b();
        }
    }

    static {
        int i12 = b.f367617a;
        f367616a = new a();
    }

    @k
    com.yandex.div.core.player.b a();

    @k
    a.C10860a b(@k Context context);
}
