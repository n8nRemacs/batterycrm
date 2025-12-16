package androidx.view;

import Y61.k;
import j.K;
import java.util.ArrayDeque;
import kotlin.Metadata;

/* compiled from: DispatchQueue.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/s;", "", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23061s {

    /* renamed from: b, reason: collision with root package name */
    public boolean f46882b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46883c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f46881a = true;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayDeque f46884d = new ArrayDeque();

    @K
    public final void a() {
        if (this.f46883c) {
            return;
        }
        try {
            this.f46883c = true;
            while (true) {
                ArrayDeque arrayDeque = this.f46884d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                if (!(this.f46882b || !this.f46881a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f46883c = false;
        }
    }
}
