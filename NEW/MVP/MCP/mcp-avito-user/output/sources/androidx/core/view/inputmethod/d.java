package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import j.N;
import j.P;
import j.X;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f45075a;

    /* compiled from: InputContentInfoCompat.java */
    @X
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final InputContentInfo f45076a;

        public a(@N InputContentInfo inputContentInfo) {
            this.f45076a = inputContentInfo;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    public static final class b implements c {
    }

    /* compiled from: InputContentInfoCompat.java */
    public interface c {
    }

    public d(@N a aVar) {
        this.f45075a = aVar;
    }

    @N
    public final Uri a() {
        return this.f45075a.f45076a.getContentUri();
    }

    @N
    public final ClipDescription b() {
        return this.f45075a.f45076a.getDescription();
    }

    @P
    public final Uri c() {
        return this.f45075a.f45076a.getLinkUri();
    }

    public final void d() {
        this.f45075a.f45076a.requestPermission();
    }

    @P
    public final Object e() {
        return this.f45075a.f45076a;
    }
}
