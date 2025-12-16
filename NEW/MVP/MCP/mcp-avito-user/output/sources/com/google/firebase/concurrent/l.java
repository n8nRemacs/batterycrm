package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* compiled from: FirebaseExecutors.java */
/* loaded from: classes13.dex */
public class l {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FirebaseExecutors.java */
    public static final class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a[] f360840b = {new a("INSTANCE", 0)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f360840b.clone();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a(Executor executor) {
        return new w(executor);
    }
}
