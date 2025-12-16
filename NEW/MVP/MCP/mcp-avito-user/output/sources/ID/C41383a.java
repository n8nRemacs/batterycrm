package id;

import Y61.l;
import android.app.Activity;
import java.lang.ref.WeakReference;
import javax.inject.Provider;
import kotlin.Metadata;

/* compiled from: ActivityProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid/a;", "Ljavax/inject/Provider;", "Landroid/app/Activity;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: id.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C41383a implements Provider<Activity> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public WeakReference<Activity> f398594a;

    @Override // javax.inject.Provider
    @l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity get() {
        WeakReference<Activity> weakReference = this.f398594a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
