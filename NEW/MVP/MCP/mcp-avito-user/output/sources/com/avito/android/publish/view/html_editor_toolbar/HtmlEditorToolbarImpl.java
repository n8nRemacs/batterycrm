package com.avito.android.publish.view.html_editor_toolbar;

import Gf0.InterfaceC13874a;
import Gf0.ViewOnClickListenerC13875b;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import com.avito.android.html_formatter.b;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.avito.android.publish.view.html_editor_toolbar.HtmlEditorToolbarImpl;
import com.jakewharton.rxrelay3.c;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: HtmlEditorToolbar.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/html_editor_toolbar/HtmlEditorToolbarImpl;", "LGf0/a;", "TextFormat", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HtmlEditorToolbarImpl implements InterfaceC13874a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f245646a;

    /* renamed from: b, reason: collision with root package name */
    public final Chips f245647b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f245648c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f245649d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c<FormatChange> f245650e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c<EditorNavigationEvent> f245651f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<TextFormat> f245652g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final c f245653h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final c f245654i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HtmlEditorToolbar.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/html_editor_toolbar/HtmlEditorToolbarImpl$TextFormat;", "", "Lcom/avito/android/lib/design/chips/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TextFormat implements h {

        /* renamed from: d, reason: collision with root package name */
        public static final TextFormat f245655d;

        /* renamed from: e, reason: collision with root package name */
        public static final TextFormat f245656e;

        /* renamed from: f, reason: collision with root package name */
        public static final TextFormat f245657f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ TextFormat[] f245658g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f245659h;

        /* renamed from: b, reason: collision with root package name */
        public final int f245660b;

        /* renamed from: c, reason: collision with root package name */
        public final int f245661c;

        static {
            TextFormat textFormat = new TextFormat("BOLD", 0, R.drawable.ic_bold_24, 1);
            f245655d = textFormat;
            TextFormat textFormat2 = new TextFormat("LIST", 1, R.drawable.ic_list_bulleted_24, 4);
            f245656e = textFormat2;
            TextFormat textFormat3 = new TextFormat("NUMERIC_LIST", 2, R.drawable.ic_list_numeric_24, 8);
            f245657f = textFormat3;
            TextFormat[] textFormatArr = {textFormat, textFormat2, textFormat3};
            f245658g = textFormatArr;
            f245659h = kotlin.enums.c.a(textFormatArr);
        }

        public TextFormat(@InterfaceC42165v String str, int i12, int i13, int i14) {
            this.f245660b = i13;
            this.f245661c = i14;
        }

        public static TextFormat valueOf(String str) {
            return (TextFormat) Enum.valueOf(TextFormat.class, str);
        }

        public static TextFormat[] values() {
            return (TextFormat[]) f245658g.clone();
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@k Object obj) {
            if (obj instanceof TextFormat) {
                return this.f245661c == ((TextFormat) obj).f245661c;
            }
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: W */
        public final /* bridge */ /* synthetic */ CharSequence getF262141c() {
            return "";
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final e e2() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0 */
        public final boolean getF106770d() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final e getImage() {
            return new e.c(this.f245660b);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF15843e() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @l
        public final e q1() {
            return null;
        }
    }

    /* compiled from: HtmlEditorToolbar.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/view/html_editor_toolbar/HtmlEditorToolbarImpl$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {
        public a() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@k h hVar) {
            HtmlEditorToolbarImpl htmlEditorToolbarImpl = HtmlEditorToolbarImpl.this;
            FormatChange formatChangeA = HtmlEditorToolbarImpl.a(htmlEditorToolbarImpl, (TextFormat) hVar, false);
            if (formatChangeA != null) {
                htmlEditorToolbarImpl.f245650e.accept(formatChangeA);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@k h hVar) {
            HtmlEditorToolbarImpl htmlEditorToolbarImpl = HtmlEditorToolbarImpl.this;
            FormatChange formatChangeA = HtmlEditorToolbarImpl.a(htmlEditorToolbarImpl, (TextFormat) hVar, true);
            if (formatChangeA != null) {
                htmlEditorToolbarImpl.f245650e.accept(formatChangeA);
            }
        }
    }

    public HtmlEditorToolbarImpl(@k View view) {
        this.f245646a = view;
        Chips chips = (Chips) view.findViewById(R.id.style_chips);
        this.f245647b = chips;
        Button button = (Button) view.findViewById(R.id.keyboard);
        Button button2 = (Button) view.findViewById(R.id.undo);
        this.f245648c = button2;
        Button button3 = (Button) view.findViewById(R.id.redo);
        this.f245649d = button3;
        c<FormatChange> cVar = new c<>();
        this.f245650e = cVar;
        c<EditorNavigationEvent> cVar2 = new c<>();
        this.f245651f = cVar2;
        List<TextFormat> listU = C42745f0.U(TextFormat.f245655d, TextFormat.f245656e, TextFormat.f245657f);
        this.f245652g = listU;
        chips.setData(listU);
        chips.setChipsSelectedListener(new a());
        button.setOnClickListener(new ViewOnClickListenerC13875b(view, 0));
        final int i12 = 0;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Gf0.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HtmlEditorToolbarImpl f6701c;

            {
                this.f6701c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f6701c.f245651f.accept(EditorNavigationEvent.f164126b);
                        break;
                    default:
                        this.f6701c.f245651f.accept(EditorNavigationEvent.f164127c);
                        break;
                }
            }
        });
        final int i13 = 1;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: Gf0.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ HtmlEditorToolbarImpl f6701c;

            {
                this.f6701c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f6701c.f245651f.accept(EditorNavigationEvent.f164126b);
                        break;
                    default:
                        this.f6701c.f245651f.accept(EditorNavigationEvent.f164127c);
                        break;
                }
            }
        });
        this.f245653h = cVar;
        this.f245654i = cVar2;
    }

    public static final FormatChange a(HtmlEditorToolbarImpl htmlEditorToolbarImpl, TextFormat textFormat, boolean z12) {
        FormatChange aVar;
        htmlEditorToolbarImpl.getClass();
        int i12 = textFormat.f245661c;
        if (i12 == 1 || i12 == 2) {
            aVar = new com.avito.android.html_formatter.a(i12, z12 ? FormatChange.Type.f164160b : FormatChange.Type.f164161c, null);
        } else {
            if (i12 != 4 && i12 != 8) {
                return null;
            }
            aVar = new b(i12, z12 ? FormatChange.Type.f164160b : FormatChange.Type.f164161c, null);
        }
        return aVar;
    }

    public final void b(int i12) {
        ArrayList arrayList = new ArrayList();
        for (TextFormat textFormat : this.f245652g) {
            int i13 = textFormat.f245661c;
            if ((i13 & i12) == i13) {
                arrayList.add(textFormat);
            }
        }
        Chips chips = this.f245647b;
        if (chips.s().equals(arrayList)) {
            return;
        }
        chips.j();
        chips.r(arrayList);
    }
}
