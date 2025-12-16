package com.my.target;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import com.my.target.C37788h;
import com.my.target.C37798m;
import com.my.target.E;
import e11.C39924z;
import e11.i2;
import e11.k2;
import e11.m2;
import h11.InterfaceC40761a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class D implements InterfaceC40761a.InterfaceC11238a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final List<C37788h.a> f364358a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final h11.d f364359b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public HashMap f364360c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public InterfaceC40761a f364361d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public C37798m.a f364362e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public WeakReference<Context> f364363f;

    public D(@j.N List<C37788h.a> list, @j.N h11.d dVar) {
        this.f364358a = list;
        this.f364359b = dVar;
    }

    @Override // h11.InterfaceC40761a.InterfaceC11238a
    public final void a(@j.N h11.b bVar) {
        Context context;
        HashMap map;
        C37788h.a aVar;
        C37798m.a aVar2;
        if (bVar.f396978b == 1) {
            InterfaceC40761a interfaceC40761a = this.f364361d;
            if (interfaceC40761a == null) {
                return;
            }
            interfaceC40761a.dismiss();
            this.f364361d = null;
            this.f364360c = null;
            return;
        }
        WeakReference<Context> weakReference = this.f364363f;
        if (weakReference == null || (context = weakReference.get()) == null || (map = this.f364360c) == null || (aVar = (C37788h.a) map.get(bVar)) == null) {
            return;
        }
        String str = aVar.f364856c;
        if (!TextUtils.isEmpty(str)) {
            k2 k2Var = k2.f394669a;
            k2Var.getClass();
            if (!TextUtils.isEmpty(str)) {
                m2.c(new com.avito.konveyor.item_visibility_tracker.c(k2Var, str, context.getApplicationContext(), 12));
            }
        }
        if (aVar.f364855b.equals("copy")) {
            String str2 = aVar.f364858e;
            if (str2 != null) {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copied id", str2));
            }
            InterfaceC40761a interfaceC40761a2 = this.f364361d;
            if (interfaceC40761a2 == null) {
                return;
            }
            interfaceC40761a2.dismiss();
            this.f364361d = null;
            this.f364360c = null;
            return;
        }
        String str3 = aVar.f364857d;
        if (!TextUtils.isEmpty(str3)) {
            i2.a(str3, context);
        }
        if (aVar.f364859f && (aVar2 = this.f364362e) != null) {
            aVar2.a(context);
        }
        InterfaceC40761a interfaceC40761a3 = this.f364361d;
        if (interfaceC40761a3 == null) {
            return;
        }
        interfaceC40761a3.dismiss();
        this.f364361d = null;
        this.f364360c = null;
    }

    public final void b(@j.N Context context) {
        List<C37788h.a> list = this.f364358a;
        if (list.size() == 0) {
            return;
        }
        e11.G gA2 = this.f364359b.a();
        this.f364361d = gA2;
        this.f364363f = new WeakReference<>(context);
        if (this.f364360c == null) {
            this.f364360c = new HashMap();
        }
        for (C37788h.a aVar : list) {
            h11.b bVar = new h11.b(aVar.f364854a, 0);
            gA2.a(bVar);
            this.f364360c.put(bVar, aVar);
        }
        gA2.a(new h11.b("", 1));
        gA2.f394354b = new WeakReference<>(this);
        ArrayList arrayList = gA2.f394353a;
        if (arrayList.isEmpty() || gA2.f394354b == null) {
            return;
        }
        E e12 = new E(context, arrayList, gA2.f394354b);
        gA2.f394355c = new WeakReference<>(e12);
        ArrayList arrayList2 = e12.f364369f;
        if (arrayList2.size() != 0) {
            if (arrayList2.size() == 1 && ((h11.b) arrayList2.get(0)).f396978b == 1) {
                return;
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h11.b bVar2 = (h11.b) it.next();
                if (bVar2.f396978b != 0) {
                    e12.f364373j = bVar2;
                    com.avito.android.verification.verification_input_inn.o oVar = new com.avito.android.verification.verification_input_inn.o(13, e12, bVar2);
                    Context context2 = e12.getContext();
                    ImageButton imageButton = new ImageButton(context2);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    int iC2 = C39924z.c(1, context2);
                    int i12 = iC2 * 20;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i12, config);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setStrokeWidth(iC2 * 2);
                    paint.setAntiAlias(true);
                    paint.setColor(-5131855);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    paint.setStyle(Paint.Style.STROKE);
                    Path path = new Path();
                    path.setFillType(Path.FillType.EVEN_ODD);
                    float f12 = iC2 * 7;
                    path.moveTo(iC2, f12);
                    path.lineTo(iC2 * 10, iC2 * 14);
                    path.lineTo(iC2 * 19, f12);
                    canvas.drawPath(path, paint);
                    imageButton.setImageBitmap(bitmapCreateBitmap);
                    C39924z.g(imageButton, -1, -3158065);
                    imageButton.setOnClickListener(oVar);
                    e12.f364371h = imageButton;
                    e12.addView(imageButton);
                    e12.setOnClickListener(oVar);
                    break;
                }
            }
            h11.b bVar3 = e12.f364373j;
            if (bVar3 != null) {
                arrayList2.remove(bVar3);
            }
            e12.f364365b.setAdapter((ListAdapter) new E.a(arrayList2, e12.f364370g));
            try {
                V v12 = new V(e12, e12.getContext());
                e12.f364372i = new WeakReference<>(v12);
                v12.show();
            } catch (Throwable th2) {
                th2.printStackTrace();
                e12.q();
            }
        }
    }

    public final boolean c() {
        return this.f364361d != null;
    }
}
