package com.avito.android.social;

import android.content.Intent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SignInManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/social/D;", "Lcom/avito/android/social/m;", "b", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface D extends InterfaceC35021m {

    /* compiled from: SignInManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SignInManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/social/D$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/social/D$b$a;", "Lcom/avito/android/social/D$b$b;", "Lcom/avito/android/social/D$b$c;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: SignInManager.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/D$b$a;", "Lcom/avito/android/social/D$b;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f284269a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: SignInManager.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/D$b$b;", "Lcom/avito/android/social/D$b;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.social.D$b$b, reason: collision with other inner class name */
        public static final class C8495b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C8495b f284270a = new C8495b();

            public C8495b() {
                super(null);
            }
        }

        /* compiled from: SignInManager.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/social/D$b$c;", "Lcom/avito/android/social/D$b;", "<init>", "()V", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f284271a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    void a();

    @Y61.l
    String c();

    @Y61.l
    String d();

    void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar);

    boolean g(int i12, int i13, @Y61.l Intent intent, @Y61.l Y41.l<? super b, G0> lVar);
}
