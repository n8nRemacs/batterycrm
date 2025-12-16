package com.squareup.anvil.annotations;

import P41.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.o0;

/* JADX WARN: Method from annotation default annotation not found: boundType */
/* JADX WARN: Method from annotation default annotation not found: ignoreQualifier */
/* JADX WARN: Method from annotation default annotation not found: priority */
/* JADX WARN: Method from annotation default annotation not found: rank */
/* JADX WARN: Method from annotation default annotation not found: replaces */
/* compiled from: ContributesBinding.kt */
@Target({ElementType.TYPE})
@d
@P41.b
@Retention(RetentionPolicy.RUNTIME)
@P41.c
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010BS\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/anvil/annotations/ContributesBinding;", "", "Lkotlin/reflect/d;", "scope", "boundType", "", "replaces", "Lcom/squareup/anvil/annotations/ContributesBinding$Priority;", "priority", "", "ignoreQualifier", "", "rank", "<init>", "(Lkotlin/reflect/d;Lkotlin/reflect/d;Lkotlin/Array;Lcom/squareup/anvil/annotations/ContributesBinding$Priority;ZI)V", "a", "Priority", "annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Repeatable(b.class)
/* loaded from: classes7.dex */
public @interface ContributesBinding {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ContributesBinding.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/anvil/annotations/ContributesBinding$Priority;", "", "annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class Priority {

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC42830m
        public static final Priority f366286b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Priority[] f366287c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f366288d;

        static {
            Priority priority = new Priority("NORMAL", 0);
            f366286b = priority;
            Priority[] priorityArr = {priority, new Priority("HIGH", 1), new Priority("HIGHEST", 2)};
            f366287c = priorityArr;
            f366288d = kotlin.enums.c.a(priorityArr);
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f366287c.clone();
        }
    }

    /* compiled from: ContributesBinding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/anvil/annotations/ContributesBinding$a;", "", "<init>", "()V", "annotations"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: ContributesBinding.kt */
    @Target({ElementType.TYPE})
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @d
    @o0
    @Retention(RetentionPolicy.RUNTIME)
    @P41.c
    public @interface b {
    }

    /* compiled from: ContributesBinding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c {
    }
}
