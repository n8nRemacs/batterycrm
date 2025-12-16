package com.google.firebase.messaging;

import androidx.collection.C20199a;
import java.util.concurrent.ExecutorService;

/* compiled from: RequestDeduplicator.java */
/* loaded from: classes6.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f361734a;

    /* renamed from: b, reason: collision with root package name */
    @j.B
    public final C20199a f361735b = new C20199a();

    /* compiled from: RequestDeduplicator.java */
    public interface a {
    }

    public C(ExecutorService executorService) {
        this.f361734a = executorService;
    }
}
