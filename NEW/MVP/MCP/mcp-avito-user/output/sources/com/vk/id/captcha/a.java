package com.vk.id.captcha;

import Y61.k;
import Y61.l;
import com.vk.id.captcha.api.data.VKCaptchaError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VKCaptchaState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/vk/id/captcha/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/vk/id/captcha/a$a;", "Lcom/vk/id/captcha/a$b;", "Lcom/vk/id/captcha/a$c;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* compiled from: VKCaptchaState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/vk/id/captcha/a$a;", "Lcom/vk/id/captcha/a;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.a$a, reason: collision with other inner class name */
    public static final /* data */ class C10823a extends a {

        @k
        public static final C10823a INSTANCE = new C10823a();

        private C10823a() {
            super(null);
        }

        public final boolean equals(@l Object p02) {
            return this == p02 || (p02 instanceof C10823a);
        }

        public final int hashCode() {
            return -1971007956;
        }

        @k
        public final String toString() {
            return "CancelledByClient";
        }
    }

    /* compiled from: VKCaptchaState.kt */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        private final VKCaptchaError f366775a;

        /* renamed from: b, reason: collision with root package name */
        @l
        private final String f366776b;

        public b(@k VKCaptchaError vKCaptchaError, @l String str) {
            super(null);
            this.f366775a = vKCaptchaError;
            this.f366776b = str;
        }

        @k
        public final VKCaptchaError a() {
            return this.f366775a;
        }

        @l
        public final String b() {
            return this.f366776b;
        }
    }

    /* compiled from: VKCaptchaState.kt */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        private final String f366777a;

        /* renamed from: b, reason: collision with root package name */
        @l
        private final String f366778b;

        public c(@k String str, @l String str2) {
            super(null);
            this.f366777a = str;
            this.f366778b = str2;
        }

        @k
        public final String a() {
            return this.f366777a;
        }

        @l
        public final String b() {
            return this.f366778b;
        }
    }

    private a() {
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }
}
