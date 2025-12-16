package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: MenuProvider.java */
/* loaded from: classes.dex */
public interface C {
    void b(@j.N Menu menu, @j.N MenuInflater menuInflater);

    boolean d(@j.N MenuItem menuItem);

    default void a(@j.N Menu menu) {
    }

    default void c(@j.N Menu menu) {
    }
}
