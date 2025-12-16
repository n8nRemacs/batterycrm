package androidx.window.embedding;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.collection.C20203c;
import androidx.window.embedding.P;
import androidx.window.embedding.r;
import j.InterfaceC42164u;
import j.X;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ExtensionEmbeddingBackend.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/t;", "Landroidx/window/embedding/l;", "a", "b", "c", "d", "e", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.window.embedding.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23533t implements InterfaceC23526l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f55252a = 0;

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/embedding/t$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/embedding/P$b;", "a", "(Landroid/content/Context;)Landroidx/window/embedding/P$b;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    /* renamed from: androidx.window.embedding.t$a */
    public static final class a {
        static {
            new a();
        }

        @InterfaceC42164u
        @Y61.k
        public final P.b a(@Y61.k Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager.Property property = context.getPackageManager().getProperty("android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED", context.getPackageName());
                if (property.isBoolean()) {
                    return property.getBoolean() ? P.b.f55221b : P.b.f55222c;
                }
                androidx.window.core.d.f55182a.getClass();
                androidx.window.core.d dVar = androidx.window.core.d.f55182a;
                return P.b.f55223d;
            } catch (PackageManager.NameNotFoundException unused) {
                androidx.window.core.d.f55182a.getClass();
                androidx.window.core.d dVar2 = androidx.window.core.d.f55182a;
                return P.b.f55223d;
            } catch (Exception unused2) {
                androidx.window.core.d.f55182a.getClass();
                androidx.window.core.d dVar3 = androidx.window.core.d.f55182a;
                return P.b.f55223d;
            }
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/embedding/t$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Landroidx/window/embedding/t;", "globalInstance", "Landroidx/window/embedding/t;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.t$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/t$c;", "Landroidx/window/embedding/r$a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.t$c */
    public final class c implements r.a {
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/embedding/t$d;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.t$d */
    public static final class d {
        public d() {
            new C20203c();
            new HashMap();
        }
    }

    /* compiled from: ExtensionEmbeddingBackend.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/t$e;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.t$e */
    public static final class e {
        public e() {
            throw null;
        }
    }

    static {
        new b(null);
        new ReentrantLock();
    }
}
