package com.avito.android.autoteka.helpers;

import kotlin.Metadata;

/* compiled from: AutotekaAbUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/helpers/AutotekaAbUtil;", "", "()V", "TeaserTest", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaAbUtil {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AutotekaAbUtil.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/helpers/AutotekaAbUtil$TeaserTest;", "", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TeaserTest {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ TeaserTest[] f96645b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f96646c;

        static {
            TeaserTest[] teaserTestArr = {new TeaserTest("TEASER_WITH_LOCKS", 0), new TeaserTest("MINIMAL", 1)};
            f96645b = teaserTestArr;
            f96646c = kotlin.enums.c.a(teaserTestArr);
        }

        public static TeaserTest valueOf(String str) {
            return (TeaserTest) Enum.valueOf(TeaserTest.class, str);
        }

        public static TeaserTest[] values() {
            return (TeaserTest[]) f96645b.clone();
        }
    }

    static {
        new AutotekaAbUtil();
    }
}
