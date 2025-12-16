package ru.mts.biometry.sdk.view.modalcard.wheel.picker.date;

import Ga1.a;
import Ga1.c;
import Ga1.d;
import Ga1.e;
import Ga1.f;
import Ga1.g;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.avito.android.remote.model.category_parameters.SelectionType;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView;

@s0
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0001@B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u0013J\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010-\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R$\u00100\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010,R$\u00107\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010:\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010=\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010)\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010!\"\u0004\b?\u0010,¨\u0006A"}, d2 = {"Lru/mts/biometry/sdk/view/modalcard/wheel/picker/date/DatePicker;", "Landroid/widget/LinearLayout;", "LGa1/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getYear", "()I", "Lru/mts/biometry/sdk/view/modalcard/wheel/picker/date/b;", "getMonth", "()Lru/mts/biometry/sdk/view/modalcard/wheel/picker/date/b;", "getDay", SelectionType.TYPE_DAY, "Lkotlin/G0;", "setMaxDay", "(I)V", "setMinDay", SelectionType.TYPE_MONTH, "setMaxMonth", "(Lru/mts/biometry/sdk/view/modalcard/wheel/picker/date/b;)V", "setMinMonth", SelectionType.TYPE_YEAR, "setMaxYear", "setMinYear", "setSelectedYear", "setSelectedMonth", "setSelectedDay", "", "getSelectedDate", "()J", "LGa1/b;", "dataSelectListener", "LGa1/b;", "getDataSelectListener", "()LGa1/b;", "setDataSelectListener", "(LGa1/b;)V", "date", "getMinDate", "setMinDate", "(J)V", "minDate", "getMaxDate", "setMaxDate", "maxDate", "", "isVisible", "getDaysIsVisible", "()Z", "setDaysIsVisible", "(Z)V", "daysIsVisible", "getMonthsIsVisible", "setMonthsIsVisible", "monthsIsVisible", "getYearsIsVisible", "setYearsIsVisible", "yearsIsVisible", "getDate", "setDate", "ru/mts/biometry/sdk/view/modalcard/wheel/picker/date/c", "sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class DatePicker extends LinearLayout implements g {

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f436620b;

    /* renamed from: c, reason: collision with root package name */
    public final f f436621c;

    /* renamed from: d, reason: collision with root package name */
    public final WheelView f436622d;

    /* renamed from: e, reason: collision with root package name */
    public final WheelView f436623e;

    /* renamed from: f, reason: collision with root package name */
    public final WheelView f436624f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f436625g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f436626h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f436627i;

    public DatePicker(@k Context context, @l AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        setOrientation(0);
        this.f436621c = new f(this);
        this.f436620b = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = this.f436620b;
        (linearLayout == null ? null : linearLayout).setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = this.f436620b;
        (linearLayout2 == null ? null : linearLayout2).setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        addView(frameLayout);
        LinearLayout linearLayout3 = this.f436620b;
        frameLayout.addView(linearLayout3 == null ? null : linearLayout3);
        LinearLayout linearLayout4 = this.f436620b;
        (linearLayout4 == null ? null : linearLayout4).removeAllViews();
        LinearLayout linearLayout5 = this.f436620b;
        linearLayout5 = linearLayout5 == null ? null : linearLayout5;
        WheelView wheelView = new WheelView(getContext());
        wheelView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        wheelView.setOnWheelViewListener(new c(this));
        wheelView.setLooping(true);
        wheelView.setId(View.generateViewId());
        this.f436622d = wheelView;
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout6.setOrientation(1);
        this.f436625g = linearLayout6;
        WheelView wheelView2 = this.f436622d;
        linearLayout6.addView(wheelView2 == null ? null : wheelView2);
        LinearLayout linearLayout7 = this.f436625g;
        linearLayout5.addView(linearLayout7 == null ? null : linearLayout7);
        LinearLayout linearLayout8 = this.f436620b;
        linearLayout8 = linearLayout8 == null ? null : linearLayout8;
        WheelView wheelView3 = new WheelView(getContext());
        wheelView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        wheelView3.setOnWheelViewListener(new d(this));
        wheelView3.setLooping(true);
        wheelView3.setId(View.generateViewId());
        this.f436623e = wheelView3;
        LinearLayout linearLayout9 = new LinearLayout(getContext());
        linearLayout9.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout9.setOrientation(1);
        this.f436626h = linearLayout9;
        WheelView wheelView4 = this.f436623e;
        linearLayout9.addView(wheelView4 == null ? null : wheelView4);
        LinearLayout linearLayout10 = this.f436626h;
        linearLayout8.addView(linearLayout10 == null ? null : linearLayout10);
        LinearLayout linearLayout11 = this.f436620b;
        linearLayout11 = linearLayout11 == null ? null : linearLayout11;
        WheelView wheelView5 = new WheelView(getContext());
        wheelView5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        wheelView5.setOnWheelViewListener(new e(this));
        wheelView5.setId(View.generateViewId());
        this.f436624f = wheelView5;
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout12.setOrientation(1);
        this.f436627i = linearLayout12;
        WheelView wheelView6 = this.f436624f;
        linearLayout12.addView(wheelView6 == null ? null : wheelView6);
        LinearLayout linearLayout13 = this.f436627i;
        linearLayout11.addView(linearLayout13 != null ? linearLayout13 : null);
        a();
    }

    public final void a() throws Resources.NotFoundException {
        d();
        c();
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() throws android.content.res.Resources.NotFoundException {
        /*
            r10 = this;
            Ga1.f r0 = r10.f436621c
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = r0
        L8:
            Ga1.a r2 = r2.f6583d
            int r2 = r2.f6572a
            if (r0 != 0) goto Lf
            r0 = r1
        Lf:
            Ga1.a r3 = r0.f6581b
            int r3 = r3.f6572a
            Ga1.a r4 = r0.f6582c
            int r4 = r4.f6572a
            int r3 = r3 - r4
            int r3 = r3 + 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L20:
            java.lang.String r6 = ""
            if (r5 >= r3) goto L3b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            Ga1.a r6 = r0.f6582c
            int r6 = r6.f6572a
            int r6 = r6 + r5
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r4.add(r6)
            int r5 = r5 + 1
            goto L20
        L3b:
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r10.f436624f
            if (r0 != 0) goto L40
            r0 = r1
        L40:
            java.util.List r0 = r0.getItems()
            boolean r0 = r0.isEmpty()
            r3 = 3
            if (r0 != 0) goto L6c
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r10.f436624f
            if (r0 != 0) goto L50
            r0 = r1
        L50:
            java.util.List r0 = r0.getItems()
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r5 = r10.f436624f
            if (r5 != 0) goto L59
            r5 = r1
        L59:
            java.util.List r5 = r5.getItems()
            int r5 = r5.size()
            int r5 = r5 - r3
            java.util.List r0 = r0.subList(r3, r5)
            boolean r0 = kotlin.jvm.internal.L.f(r0, r4)
            if (r0 != 0) goto L92
        L6c:
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r10.f436624f
            if (r0 != 0) goto L71
            r0 = r1
        L71:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r4.iterator()
        L7a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            Fa1.b r9 = new Fa1.b
            r9.<init>(r8)
            r5.add(r9)
            goto L7a
        L8f:
            r0.setItems(r5)
        L92:
            int r0 = r4.size()
            if (r0 >= r3) goto La3
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r10.f436624f
            if (r0 != 0) goto L9d
            r0 = r1
        L9d:
            int r3 = r0.f436648M
            r0.v(r3)
            goto Lbb
        La3:
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r10.f436624f
            if (r0 != 0) goto La8
            r0 = r1
        La8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            int r3 = r4.indexOf(r3)
            r0.setSelection(r3)
        Lbb:
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r10.f436624f
            if (r0 != 0) goto Lc0
            r0 = r1
        Lc0:
            int r3 = r0.getScrollY()
            r0.f436645J = r3
            Ha1.b r3 = r0.f436644I
            r4 = 50
            r0.postDelayed(r3, r4)
            Ga1.f r0 = r10.f436621c
            if (r0 != 0) goto Ld2
            goto Ld3
        Ld2:
            r1 = r0
        Ld3:
            r1.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker.d():void");
    }

    @l
    public final Ga1.b getDataSelectListener() {
        return null;
    }

    public final long getDate() {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.f6583d.f6575d;
    }

    public int getDay() {
        WheelView wheelView = this.f436622d;
        if (wheelView == null) {
            wheelView = null;
        }
        if (wheelView.getSelectedItem().length() == 0) {
            return 1;
        }
        WheelView wheelView2 = this.f436622d;
        return Integer.parseInt((wheelView2 != null ? wheelView2 : null).getSelectedItem());
    }

    public final boolean getDaysIsVisible() {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.f6585f;
    }

    public final long getMaxDate() {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.f6581b.f6575d;
    }

    public final long getMinDate() {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.f6582c.f6575d;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    @Override // Ga1.g
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.b getMonth() throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r3.f436623e
            r1 = 0
            if (r0 != 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = r0
        L8:
            boolean r2 = r2.isLooping
            if (r2 == 0) goto Lf
            if (r0 != 0) goto L23
            goto L22
        Lf:
            if (r0 != 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r0 != 0) goto L17
            r0 = r1
        L17:
            java.lang.String r0 = r0.getSelectedItem()
            r2.setSelection(r0)
            ru.mts.biometry.sdk.view.modalcard.wheel.view.WheelView r0 = r3.f436623e
            if (r0 != 0) goto L23
        L22:
            r0 = r1
        L23:
            java.lang.String r0 = r0.getSelectedItem()
            ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.b r0 = Ga1.h.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker.getMonth():ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.b");
    }

    public final boolean getMonthsIsVisible() {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.f6586g;
    }

    public final long getSelectedDate() {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        calendar.set(1, fVar.f6583d.f6572a);
        f fVar2 = this.f436621c;
        if (fVar2 == null) {
            fVar2 = null;
        }
        calendar.set(2, fVar2.f6583d.f6573b);
        f fVar3 = this.f436621c;
        calendar.set(5, (fVar3 != null ? fVar3 : null).f6583d.f6574c);
        return calendar.getTimeInMillis();
    }

    @Override // Ga1.g
    public int getYear() {
        WheelView wheelView = this.f436624f;
        if (wheelView == null) {
            wheelView = null;
        }
        if (wheelView.getSelectedItem().length() == 0) {
            return 1900;
        }
        WheelView wheelView2 = this.f436624f;
        return Integer.parseInt((wheelView2 != null ? wheelView2 : null).getSelectedItem());
    }

    public final boolean getYearsIsVisible() {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        return fVar.f6587h;
    }

    public final void setDate(long j12) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        fVar.f6583d = new a(j12);
        fVar.f6580a.a();
    }

    public final void setDaysIsVisible(boolean z12) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        if (fVar.f6585f != z12) {
            fVar.f6585f = z12;
            fVar.f6580a.a();
        }
        if (z12) {
            return;
        }
        WheelView wheelView = this.f436622d;
        if (wheelView == null) {
            wheelView = null;
        }
        wheelView.f436644I = null;
        LinearLayout linearLayout = this.f436620b;
        if (linearLayout == null) {
            linearLayout = null;
        }
        LinearLayout linearLayout2 = this.f436625g;
        linearLayout.removeView(linearLayout2 != null ? linearLayout2 : null);
    }

    public final void setMaxDate(long j12) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        fVar.f6581b = new a(j12);
        fVar.f6580a.a();
    }

    public final void setMaxDay(int day) {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6581b.f6574c = day;
        b();
    }

    public final void setMaxMonth(@k b month) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6581b.f6573b = month.ordinal();
        c();
    }

    public final void setMaxYear(int year) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if ((fVar == null ? null : fVar).f6581b.f6572a == year) {
            return;
        }
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6581b.f6572a = year;
        d();
    }

    public final void setMinDate(long j12) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.getClass();
        fVar.f6582c = new a(j12);
        fVar.f6580a.a();
    }

    public final void setMinDay(int day) {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6582c.f6574c = day;
        b();
    }

    public final void setMinMonth(@k b month) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6582c.f6573b = month.ordinal();
        c();
    }

    public final void setMinYear(int year) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if ((fVar == null ? null : fVar).f6582c.f6572a == year) {
            return;
        }
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6582c.f6572a = year;
        d();
    }

    public final void setMonthsIsVisible(boolean z12) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6586g = z12;
        fVar.f6580a.a();
        if (z12) {
            return;
        }
        WheelView wheelView = this.f436623e;
        if (wheelView == null) {
            wheelView = null;
        }
        wheelView.f436644I = null;
        LinearLayout linearLayout = this.f436620b;
        if (linearLayout == null) {
            linearLayout = null;
        }
        LinearLayout linearLayout2 = this.f436626h;
        linearLayout.removeView(linearLayout2 != null ? linearLayout2 : null);
    }

    public final void setSelectedDay(int day) {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        a aVar = fVar.f6583d;
        aVar.f6574c = day;
        int i12 = aVar.f6572a;
        int i13 = aVar.f6573b;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i12);
        calendar.set(2, i13);
        int actualMaximum = calendar.getActualMaximum(5);
        if (day > actualMaximum) {
            day = actualMaximum;
        }
        calendar.set(5, day);
        aVar.a(calendar.getTimeInMillis());
        f fVar2 = fVar.f6580a.f436621c;
        a aVar2 = (fVar2 != null ? fVar2 : null).f6583d;
        b();
    }

    public final void setSelectedMonth(@k b month) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        int iOrdinal = month.ordinal();
        a aVar = fVar.f6583d;
        aVar.f6573b = iOrdinal;
        int i12 = aVar.f6572a;
        int i13 = aVar.f6574c;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i12);
        calendar.set(2, iOrdinal);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i13 > actualMaximum) {
            i13 = actualMaximum;
        }
        calendar.set(5, i13);
        aVar.a(calendar.getTimeInMillis());
        DatePicker datePicker = fVar.f6580a;
        datePicker.b();
        f fVar2 = datePicker.f436621c;
        a aVar2 = (fVar2 != null ? fVar2 : null).f6583d;
        c();
    }

    public final void setSelectedYear(int year) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(year);
        d();
    }

    public final void setYearsIsVisible(boolean z12) throws Resources.NotFoundException {
        f fVar = this.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f6587h = z12;
        fVar.f6580a.a();
        if (z12) {
            return;
        }
        WheelView wheelView = this.f436624f;
        if (wheelView == null) {
            wheelView = null;
        }
        wheelView.f436644I = null;
        LinearLayout linearLayout = this.f436620b;
        if (linearLayout == null) {
            linearLayout = null;
        }
        LinearLayout linearLayout2 = this.f436627i;
        linearLayout.removeView(linearLayout2 != null ? linearLayout2 : null);
    }

    public final void setDataSelectListener(@l Ga1.b bVar) {
    }
}
