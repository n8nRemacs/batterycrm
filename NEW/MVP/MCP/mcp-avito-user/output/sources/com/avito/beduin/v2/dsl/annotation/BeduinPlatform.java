package com.avito.beduin.v2.dsl.annotation;

import P41.c;
import P41.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: BeduinPlatform.kt */
@Target({})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/beduin/v2/dsl/annotation/BeduinPlatform;", "", "", "Lcom/avito/beduin/v2/dsl/annotation/BeduinPlatform$Platform;", "platform", "<init>", "(Lkotlin/Array;)V", "Platform", "annotation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@Retention(RetentionPolicy.RUNTIME)
@c
/* loaded from: classes5.dex */
public @interface BeduinPlatform {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinPlatform.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/dsl/annotation/BeduinPlatform$Platform;", "", "annotation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Platform {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Platform[] f336389b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f336390c;

        static {
            Platform[] platformArr = {new Platform("All", 0), new Platform("Android", 1), new Platform("iOS", 2), new Platform("Mav", 3), new Platform("Desktop", 4)};
            f336389b = platformArr;
            f336390c = kotlin.enums.c.a(platformArr);
        }

        public Platform() {
            throw null;
        }

        public static Platform valueOf(String str) {
            return (Platform) Enum.valueOf(Platform.class, str);
        }

        public static Platform[] values() {
            return (Platform[]) f336389b.clone();
        }
    }
}
