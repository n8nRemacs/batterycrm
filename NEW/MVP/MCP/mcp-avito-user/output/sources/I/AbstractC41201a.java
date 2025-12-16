package i;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: ActivityResultContract.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Li/a;", "I", "O", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "Li/a$a;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/Object;)Li/a$a;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41201a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Li/a$a;", "T", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i.a$a, reason: collision with other inner class name */
    public static final class C11360a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Serializable f398324a;

        public C11360a(Serializable serializable) {
            this.f398324a = serializable;
        }
    }

    @k
    public abstract Intent createIntent(@k Context context, I input);

    @l
    public C11360a<O> getSynchronousResult(@k Context context, I input) {
        return null;
    }

    public abstract O parseResult(int resultCode, @l Intent intent);
}
