package com.facebook.infer.annotation;

import I41.g;
import K41.d;
import Q41.c;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: trustOnly */
@c
@Target({ElementType.TYPE})
@d
@g
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes15.dex */
public @interface Nullsafe {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Mode[] f340823b = {new Mode("LOCAL", 0), new Mode("STRICT", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Mode EF5;

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f340823b.clone();
        }
    }

    /* JADX WARN: Method from annotation default annotation not found: trustAll */
    public @interface a {
    }
}
