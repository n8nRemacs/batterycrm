package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.R;
import j.N;

/* compiled from: CalendarStyle.java */
/* renamed from: com.google.android.material.datepicker.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37054b {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final C37053a f356513a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final C37053a f356514b;

    /* renamed from: c, reason: collision with root package name */
    @N
    public final C37053a f356515c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final C37053a f356516d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final C37053a f356517e;

    /* renamed from: f, reason: collision with root package name */
    @N
    public final C37053a f356518f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final C37053a f356519g;

    /* renamed from: h, reason: collision with root package name */
    @N
    public final Paint f356520h;

    public C37054b(@N Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, R.styleable.MaterialCalendar);
        this.f356513a = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayStyle, 0), context);
        this.f356519g = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayInvalidStyle, 0), context);
        this.f356514b = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_daySelectedStyle, 0), context);
        this.f356515c = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList colorStateListB = com.google.android.material.resources.c.b(typedArrayObtainStyledAttributes, context, R.styleable.MaterialCalendar_rangeFillColor);
        this.f356516d = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearStyle, 0), context);
        this.f356517e = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearSelectedStyle, 0), context);
        this.f356518f = C37053a.a(typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.f356520h = paint;
        paint.setColor(colorStateListB.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
