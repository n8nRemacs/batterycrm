package androidx.compose.ui.platform.actionmodecallback;

import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextActionModeCallback.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuItemOption {

    /* renamed from: d, reason: collision with root package name */
    public static final MenuItemOption f41381d;

    /* renamed from: e, reason: collision with root package name */
    public static final MenuItemOption f41382e;

    /* renamed from: f, reason: collision with root package name */
    public static final MenuItemOption f41383f;

    /* renamed from: g, reason: collision with root package name */
    public static final MenuItemOption f41384g;

    /* renamed from: h, reason: collision with root package name */
    public static final MenuItemOption f41385h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ MenuItemOption[] f41386i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f41387j;

    /* renamed from: b, reason: collision with root package name */
    public final int f41388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41389c;

    /* compiled from: TextActionModeCallback.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[MenuItemOption.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuItemOption menuItemOption = MenuItemOption.f41381d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuItemOption menuItemOption2 = MenuItemOption.f41381d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuItemOption menuItemOption3 = MenuItemOption.f41381d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuItemOption menuItemOption4 = MenuItemOption.f41381d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        MenuItemOption menuItemOption = new MenuItemOption("Copy", 0, 0);
        f41381d = menuItemOption;
        MenuItemOption menuItemOption2 = new MenuItemOption("Paste", 1, 1);
        f41382e = menuItemOption2;
        MenuItemOption menuItemOption3 = new MenuItemOption("Cut", 2, 2);
        f41383f = menuItemOption3;
        MenuItemOption menuItemOption4 = new MenuItemOption("SelectAll", 3, 3);
        f41384g = menuItemOption4;
        MenuItemOption menuItemOption5 = new MenuItemOption("Autofill", 4, 4);
        f41385h = menuItemOption5;
        MenuItemOption[] menuItemOptionArr = {menuItemOption, menuItemOption2, menuItemOption3, menuItemOption4, menuItemOption5};
        f41386i = menuItemOptionArr;
        f41387j = c.a(menuItemOptionArr);
    }

    public MenuItemOption(String str, int i12, int i13) {
        this.f41388b = i13;
        this.f41389c = i13;
    }

    public static MenuItemOption valueOf(String str) {
        return (MenuItemOption) Enum.valueOf(MenuItemOption.class, str);
    }

    public static MenuItemOption[] values() {
        return (MenuItemOption[]) f41386i.clone();
    }
}
