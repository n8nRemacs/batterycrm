package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import j.X;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RemoteEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/D;", "", "a", "b", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final c f45239b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PendingIntent f45240a;

    /* compiled from: RemoteEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/credentials/provider/D$a;", "", "<init>", "()V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: RemoteEntry.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/D$b;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: RemoteEntry.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/credentials/provider/D$c;", "", "<init>", "()V", "", "REVISION_ID", "I", "", "SLICE_HINT_PENDING_INTENT", "Ljava/lang/String;", "SLICE_SPEC_TYPE", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @SuppressLint({"WrongConstant"})
        @X
        @X41.n
        @Y61.l
        @RestrictTo
        public static D a(@Y61.k Slice slice) {
            Iterator it = slice.getItems().iterator();
            PendingIntent action = null;
            while (it.hasNext()) {
                SliceItem sliceItemH = androidx.core.view.accessibility.d.h(it.next());
                if (sliceItemH.hasHint("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItemH.getAction();
                }
            }
            try {
                return new D(action);
            } catch (Exception e12) {
                e12.getMessage();
                return null;
            }
        }

        @X
        @X41.n
        @Y61.k
        @RestrictTo
        public static Slice b(@Y61.k D d12) {
            androidx.core.view.accessibility.d.q();
            Slice.Builder builderF = androidx.core.view.accessibility.d.f(Uri.EMPTY, androidx.core.view.accessibility.d.z());
            builderF.addAction(d12.f45240a, androidx.core.view.accessibility.d.b(builderF).addHints(Collections.singletonList("androidx.credentials.provider.remoteEntry.SLICE_HINT_PENDING_INTENT")).build(), null);
            return builderF.build();
        }

        public c() {
        }
    }

    public D(@Y61.k PendingIntent pendingIntent) {
        this.f45240a = pendingIntent;
    }
}
