package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class Q implements Iterable<Intent> {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<Intent> f44513b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Context f44514c;

    /* compiled from: TaskStackBuilder.java */
    public interface a {
        @j.P
        Intent getSupportParentActivityIntent();
    }

    public Q(Context context) {
        this.f44514c = context;
    }

    @j.N
    public final void a(@j.N ComponentName componentName) {
        Context context = this.f44514c;
        ArrayList<Intent> arrayList = this.f44513b;
        int size = arrayList.size();
        try {
            for (Intent intentA = v.a(context, componentName); intentA != null; intentA = v.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public final void b() {
        ArrayList<Intent> arrayList = this.f44513b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f44514c;
        if (androidx.core.content.d.startActivities(context, intentArr, null)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @j.N
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f44513b.iterator();
    }
}
