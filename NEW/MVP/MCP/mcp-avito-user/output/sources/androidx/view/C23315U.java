package androidx.view;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: NavDeepLinkRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/U;", "", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23315U {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Uri f52874a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f52875b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f52876c;

    /* compiled from: NavDeepLinkRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/navigation/U$a;", "", "<init>", "()V", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.U$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1868a f52877a = new C1868a(null);

        /* compiled from: NavDeepLinkRequest.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/U$a$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.navigation.U$a$a, reason: collision with other inner class name */
        public static final class C1868a {
            public /* synthetic */ C1868a(C42822w c42822w) {
                this();
            }

            public C1868a() {
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @RestrictTo
    public C23315U(@l Uri uri, @l String str, @l String str2) {
        this.f52874a = uri;
        this.f52875b = str;
        this.f52876c = str2;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f52874a;
        if (uri != null) {
            sb2.append(" uri=");
            sb2.append(String.valueOf(uri));
        }
        String str = this.f52875b;
        if (str != null) {
            sb2.append(" action=");
            sb2.append(str);
        }
        String str2 = this.f52876c;
        if (str2 != null) {
            sb2.append(" mimetype=");
            sb2.append(str2);
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @RestrictTo
    public C23315U(@k Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }
}
