package com.yandex.metrica.networktasks.api;

/* loaded from: classes7.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    public final NetworkTask f382447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382448b;

    public c(NetworkTask networkTask, b bVar) {
        this.f382447a = networkTask;
        this.f382448b = networkTask.f382421e.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f382448b.equals(((c) obj).f382448b);
    }

    public final int hashCode() {
        return this.f382448b.hashCode();
    }
}
