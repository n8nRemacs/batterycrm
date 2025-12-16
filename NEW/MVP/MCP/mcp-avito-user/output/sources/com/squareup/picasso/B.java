package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import com.squareup.picasso.A;
import com.squareup.picasso.Picasso;
import j.k0;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestCreator.java */
/* loaded from: classes7.dex */
public class B {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f366323c = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Picasso f366324a;

    /* renamed from: b, reason: collision with root package name */
    public final A.b f366325b;

    public B(Picasso picasso, Uri uri) {
        picasso.getClass();
        this.f366324a = picasso;
        this.f366325b = new A.b(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ImageView imageView) {
        System.nanoTime();
        StringBuilder sb2 = K.f366360a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        A.b bVar = this.f366325b;
        Uri uri = bVar.f366306a;
        Picasso picasso = this.f366324a;
        if (uri == null && bVar.f366307b == 0) {
            picasso.a(imageView);
            int i12 = w.f366471e;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
                return;
            }
            return;
        }
        f366323c.getAndIncrement();
        A a12 = bVar.a();
        a12.getClass();
        picasso.getClass();
        Picasso.e eVar = picasso.f366367b;
        A a13 = eVar.a(a12);
        if (a13 == null) {
            throw new IllegalStateException("Request transformer " + eVar.getClass().getCanonicalName() + " returned null for " + a12);
        }
        StringBuilder sb3 = K.f366360a;
        String str = a13.f366291c;
        if (str != null) {
            sb3.ensureCapacity(str.length() + 50);
            sb3.append(str);
        } else {
            Uri uri2 = a13.f366289a;
            if (uri2 != null) {
                String string = uri2.toString();
                sb3.ensureCapacity(string.length() + 50);
                sb3.append(string);
            } else {
                sb3.ensureCapacity(50);
                sb3.append(a13.f366290b);
            }
        }
        sb3.append('\n');
        float f12 = a13.f366299k;
        if (f12 != 0.0f) {
            sb3.append("rotation:");
            sb3.append(f12);
            if (a13.f366302n) {
                sb3.append('@');
                sb3.append(a13.f366300l);
                sb3.append('x');
                sb3.append(a13.f366301m);
            }
            sb3.append('\n');
        }
        if (a13.a()) {
            sb3.append("resize:");
            sb3.append(a13.f366293e);
            sb3.append('x');
            sb3.append(a13.f366294f);
            sb3.append('\n');
        }
        if (a13.f366295g) {
            sb3.append("centerCrop:");
            sb3.append(a13.f366296h);
            sb3.append('\n');
        } else if (a13.f366297i) {
            sb3.append("centerInside");
            sb3.append('\n');
        }
        List<I> list = a13.f366292d;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                sb3.append(list.get(i13).key());
                sb3.append('\n');
            }
        }
        String string2 = sb3.toString();
        sb3.setLength(0);
        Bitmap bitmapA = picasso.f366371f.a(string2);
        E e12 = picasso.f366372g;
        if (bitmapA != null) {
            e12.f366332b.sendEmptyMessage(0);
        } else {
            e12.f366332b.sendEmptyMessage(1);
        }
        if (bitmapA == null) {
            int i14 = w.f366471e;
            imageView.setImageDrawable(null);
            if (imageView.getDrawable() instanceof Animatable) {
                ((Animatable) imageView.getDrawable()).start();
            }
            picasso.c(new p(picasso, imageView, a13, string2));
            return;
        }
        picasso.a(imageView);
        Context context = picasso.f366369d;
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
        int i15 = w.f366471e;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new w(context, bitmapA, drawable, loadedFrom));
    }

    @k0
    public B() {
        this.f366324a = null;
        this.f366325b = new A.b(null);
    }
}
