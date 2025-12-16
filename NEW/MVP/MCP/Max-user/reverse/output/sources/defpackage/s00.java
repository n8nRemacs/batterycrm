package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public enum s00 {
    UNKNOWN("UNKNOWN"),
    CONTROL("CONTROL"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    STICKER("STICKER"),
    SHARE("SHARE"),
    APP("APP"),
    CALL("CALL"),
    FILE("FILE"),
    CONTACT("CONTACT"),
    PRESENT("PRESENT"),
    INLINE_KEYBOARD("INLINE_KEYBOARD"),
    LOCATION("LOCATION"),
    REPLY_KEYBOARD("REPLY_KEYBOARD"),
    VIDEO_MSG("VIDEO_MSG"),
    WIDGET("WIDGET");

    public static final HashSet C0;
    public static final HashSet D0;
    public static final HashSet E0;
    public static final HashSet F0;
    public static final HashSet G0;
    public static final HashSet H0;
    public static final HashSet I0;
    public static final HashSet J0;
    public final String a;

    static {
        s00 s00Var = PHOTO;
        s00 s00Var2 = VIDEO;
        s00 s00Var3 = AUDIO;
        s00 s00Var4 = SHARE;
        s00 s00Var5 = FILE;
        s00 s00Var6 = LOCATION;
        s00 s00Var7 = VIDEO_MSG;
        C0 = new HashSet(Arrays.asList(s00Var, s00Var2, s00Var3, s00Var4, s00Var5));
        D0 = new HashSet(Arrays.asList(s00Var, s00Var2));
        E0 = new HashSet(Collections.singletonList(s00Var4));
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{s00Var5}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        F0 = new HashSet(Collections.unmodifiableList(arrayList));
        G0 = new HashSet(Collections.singletonList(s00Var3));
        H0 = new HashSet(Arrays.asList(s00Var3, s00Var7));
        I0 = new HashSet(Collections.singletonList(s00Var5));
        J0 = new HashSet(Collections.singletonList(s00Var6));
    }

    s00(String str) {
        this.a = str;
    }

    public static s00 a(String str) {
        str.getClass();
        switch (str) {
            case "WIDGET":
                return WIDGET;
            case "LOCATION":
                return LOCATION;
            case "STICKER":
                return STICKER;
            case "VIDEO_MSG":
                return VIDEO_MSG;
            case "INLINE_KEYBOARD":
                return INLINE_KEYBOARD;
            case "APP":
                return APP;
            case "CALL":
                return CALL;
            case "FILE":
                return FILE;
            case "AUDIO":
                return AUDIO;
            case "PHOTO":
                return PHOTO;
            case "SHARE":
                return SHARE;
            case "VIDEO":
                return VIDEO;
            case "PRESENT":
                return PRESENT;
            case "CONTACT":
                return CONTACT;
            case "CONTROL":
                return CONTROL;
            case "REPLY_KEYBOARD":
                return REPLY_KEYBOARD;
            default:
                return UNKNOWN;
        }
    }
}
