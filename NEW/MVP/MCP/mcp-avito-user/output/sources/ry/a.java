package RY;

import Y61.k;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: MessageListPreviewConstants.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRY/a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f14512a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Uri f14513b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Image f14514c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Image f14515d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Image f14516e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final Image f14517f;

    static {
        Uri uri = Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Juvenile_Ragdoll.jpg/1024px-Juvenile_Ragdoll.jpg");
        f14513b = uri;
        f14514c = new Image(P0.g(new Q(new Size(200, 200), uri), new Q(new Size(600, 600), uri)));
        f14515d = new Image(Collections.singletonMap(new Size(140, 105), Uri.parse("https://i.ibb.co/0sHrb8Z/1st00013300-3.png")));
        f14516e = new Image(Collections.singletonMap(new Size(256, 256), Uri.parse("https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Juvenile_Ragdoll.jpg/1024px-Juvenile_Ragdoll.jpg")));
        f14517f = new Image(Collections.singletonMap(new Size(256, 256), Uri.parse("https://upload.wikimedia.org/wikipedia/commons/6/6b/Avito_logo.png")));
    }
}
