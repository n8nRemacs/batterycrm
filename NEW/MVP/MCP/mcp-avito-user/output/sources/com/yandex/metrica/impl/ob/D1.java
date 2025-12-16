package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

/* loaded from: classes7.dex */
public abstract class D1 {

    public interface a {
        void a(Context context);
    }

    public abstract int a(Nd nd2);

    public abstract SparseArray<a> a();

    public synchronized void a(Context context) {
        try {
            Nd nd2 = new Nd(context);
            int iA2 = a(nd2);
            int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
            if (iA2 != libraryApiLevel) {
                if (iA2 > 0 && iA2 < libraryApiLevel) {
                    SparseArray<a> sparseArrayA = a();
                    while (true) {
                        iA2++;
                        if (iA2 > libraryApiLevel) {
                            break;
                        }
                        a aVar = sparseArrayA.get(iA2);
                        if (aVar != null) {
                            aVar.a(context);
                        }
                    }
                }
                a(nd2, libraryApiLevel);
                nd2.b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void a(Nd nd2, int i12);
}
