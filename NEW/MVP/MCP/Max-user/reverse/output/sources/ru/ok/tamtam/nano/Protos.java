package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.coi;
import defpackage.fl9;
import defpackage.gd3;
import defpackage.hd3;
import defpackage.jei;
import defpackage.kp7;
import defpackage.tn8;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;

/* loaded from: classes2.dex */
public interface Protos {

    public static final class Attaches extends fl9 {
        private static volatile Attaches[] _emptyArray;
        public Attach[] attach;
        public Attach.InlineKeyboard keyboard;
        public Attach.ReplyKeyboard replyKeyboard;
        public Attach.SendAction sendAction;

        public static final class Attach extends fl9 {
            public static final int APP = 7;
            public static final int AUDIO = 4;
            public static final int CALL = 8;
            public static final int CANCELLED = 1;
            public static final int CONTACT = 11;
            public static final int CONTROL = 1;
            public static final int DAILY_MEDIA = 15;
            public static final int DEFAULT = 0;
            public static final int ERROR = 3;
            public static final int FILE = 10;
            public static final int INLINE_KEYBOARD = 13;
            public static final int LOADED = 2;
            public static final int LOADING = 4;
            public static final int LOCATION = 14;
            public static final int MUSIC = 9;
            public static final int NOT_LOADED = 0;
            public static final int PHOTO = 2;
            public static final int PRESENT = 12;
            public static final int PROCESSED = 2;
            public static final int PROCESSING = 1;
            public static final int SHARE = 6;
            public static final int STICKER = 5;
            public static final int UNKNOWN = 0;
            public static final int VIDEO = 3;
            public static final int WIDGET = 16;
            private static volatile Attach[] _emptyArray;
            public App app;
            public String appVersion;
            public Audio audio;
            public long bytesDownloaded;
            public Call call;
            public Contact contact;
            public Control control;
            public File file;
            public InlineKeyboard inlineKeyboard;
            public boolean isDeleted;
            public boolean isProcessingOnServer;
            public long lastErrorTime;
            public long lastModified;
            public String localId;
            public String localPath;
            public Location location;
            public Photo photo;
            public Present present;
            public int processingOnServerStatus;
            public int progress;
            public float progressFloat;
            public boolean sensitive;
            public boolean sensitiveContentUnlocked;
            public Share share;
            public int status;
            public Sticker sticker;
            public long totalBytes;
            public int type;
            public Video video;
            public Widget widget;

            public static final class App extends fl9 {
                private static volatile App[] _emptyArray;
                public long appId;
                public String appState;
                public String icon;
                public String message;
                public String name;
                public int state;
                public long timeout;

                public App() {
                    clear();
                }

                public static App[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new App[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (App) fl9.mergeFrom(new App(), bArr);
                }

                public App clear() {
                    this.appId = 0L;
                    this.name = "";
                    this.icon = "";
                    this.message = "";
                    this.state = 0;
                    this.timeout = 0L;
                    this.appState = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.appId;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    if (!this.name.equals("")) {
                        iH += hd3.l(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        iH += hd3.l(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        iH += hd3.l(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        iH += hd3.f(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        iH += hd3.h(6, j2);
                    }
                    return !this.appState.equals("") ? hd3.l(7, this.appState) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.appId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    if (!this.name.equals("")) {
                        hd3Var.E(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        hd3Var.E(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        hd3Var.E(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        hd3Var.w(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        hd3Var.x(6, j2);
                    }
                    if (this.appState.equals("")) {
                        return;
                    }
                    hd3Var.E(7, this.appState);
                }

                public static App parseFrom(gd3 gd3Var) throws IOException {
                    return new App().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public App mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.appId = gd3Var.q();
                        } else if (iS == 18) {
                            this.name = gd3Var.r();
                        } else if (iS == 26) {
                            this.icon = gd3Var.r();
                        } else if (iS == 34) {
                            this.message = gd3Var.r();
                        } else if (iS == 40) {
                            this.state = gd3Var.p();
                        } else if (iS == 48) {
                            this.timeout = gd3Var.q();
                        } else if (iS == 58) {
                            this.appState = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Audio extends fl9 {
                public static final int FAILED = 3;
                public static final int NOT_SUPPORTED = 4;
                public static final int PROCESSING = 1;
                public static final int SUCCESS = 2;
                public static final int UNKNOWN = 0;
                private static volatile Audio[] _emptyArray;
                public long audioId;
                public long duration;
                public long lastStartTimeUpdateTimestamp;
                public long startTime;
                public String token;
                public String transcription;
                public int transcriptionStatus;
                public String url;
                public byte[] wave;

                public Audio() {
                    clear();
                }

                public static Audio[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Audio[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Audio) fl9.mergeFrom(new Audio(), bArr);
                }

                public Audio clear() {
                    this.audioId = 0L;
                    this.url = "";
                    this.duration = 0L;
                    this.wave = coi.e;
                    this.token = "";
                    this.startTime = 0L;
                    this.lastStartTimeUpdateTimestamp = 0L;
                    this.transcription = "";
                    this.transcriptionStatus = 0;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.audioId;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        iH += hd3.l(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        iH += hd3.h(3, j2);
                    }
                    if (!Arrays.equals(this.wave, coi.e)) {
                        iH += hd3.b(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        iH += hd3.l(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        iH += hd3.h(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        iH += hd3.h(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        iH += hd3.l(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    return i != 0 ? hd3.f(9, i) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.audioId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        hd3Var.E(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        hd3Var.x(3, j2);
                    }
                    if (!Arrays.equals(this.wave, coi.e)) {
                        hd3Var.s(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        hd3Var.E(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        hd3Var.x(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        hd3Var.x(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        hd3Var.E(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    if (i != 0) {
                        hd3Var.w(9, i);
                    }
                }

                public static Audio parseFrom(gd3 gd3Var) throws IOException {
                    return new Audio().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Audio mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.audioId = gd3Var.q();
                        } else if (iS == 18) {
                            this.url = gd3Var.r();
                        } else if (iS == 24) {
                            this.duration = gd3Var.q();
                        } else if (iS == 34) {
                            this.wave = gd3Var.g();
                        } else if (iS == 42) {
                            this.token = gd3Var.r();
                        } else if (iS == 48) {
                            this.startTime = gd3Var.q();
                        } else if (iS == 56) {
                            this.lastStartTimeUpdateTimestamp = gd3Var.q();
                        } else if (iS == 66) {
                            this.transcription = gd3Var.r();
                        } else if (iS == 72) {
                            int iP = gd3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                                this.transcriptionStatus = iP;
                            }
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Button extends fl9 {
                public static final int CALLBACK = 0;
                public static final int CHAT = 5;
                public static final int DEFAULT = 0;
                public static final int LINK = 1;
                public static final int MESSAGE = 6;
                public static final int NEGATIVE = 2;
                public static final int OPEN_APP = 7;
                public static final int POSITIVE = 1;
                public static final int REQUEST_CONTACT = 2;
                public static final int REQUEST_GEO_LOCATION = 3;
                public static final int UNKNOWN_INTENT = 3;
                public static final int UNKNOWN_TYPE = 4;
                private static volatile Button[] _emptyArray;
                public long contactId;
                public int intent;
                public String payload;
                public boolean quickLocation;
                public boolean showLoading;
                public String title;
                public int type;
                public String url;

                public Button() {
                    clear();
                }

                public static Button[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Button[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Button) fl9.mergeFrom(new Button(), bArr);
                }

                public Button clear() {
                    this.title = "";
                    this.type = 0;
                    this.intent = 0;
                    this.url = "";
                    this.payload = "";
                    this.showLoading = false;
                    this.quickLocation = false;
                    this.contactId = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int iL = !this.title.equals("") ? hd3.l(1, this.title) : 0;
                    int i = this.type;
                    if (i != 0) {
                        iL += hd3.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        iL += hd3.f(3, i2);
                    }
                    if (!this.url.equals("")) {
                        iL += hd3.l(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        iL += hd3.l(5, this.payload);
                    }
                    if (this.showLoading) {
                        iL += hd3.a(6);
                    }
                    if (this.quickLocation) {
                        iL += hd3.a(7);
                    }
                    long j = this.contactId;
                    return j != 0 ? hd3.h(8, j) + iL : iL;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (!this.title.equals("")) {
                        hd3Var.E(1, this.title);
                    }
                    int i = this.type;
                    if (i != 0) {
                        hd3Var.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        hd3Var.w(3, i2);
                    }
                    if (!this.url.equals("")) {
                        hd3Var.E(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        hd3Var.E(5, this.payload);
                    }
                    boolean z = this.showLoading;
                    if (z) {
                        hd3Var.r(6, z);
                    }
                    boolean z2 = this.quickLocation;
                    if (z2) {
                        hd3Var.r(7, z2);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        hd3Var.x(8, j);
                    }
                }

                public static Button parseFrom(gd3 gd3Var) throws IOException {
                    return new Button().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Button mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS != 0) {
                            if (iS == 10) {
                                this.title = gd3Var.r();
                            } else if (iS == 16) {
                                int iP = gd3Var.p();
                                switch (iP) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        this.type = iP;
                                        break;
                                }
                            } else if (iS == 24) {
                                int iP2 = gd3Var.p();
                                if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                                    this.intent = iP2;
                                }
                            } else if (iS == 34) {
                                this.url = gd3Var.r();
                            } else if (iS == 42) {
                                this.payload = gd3Var.r();
                            } else if (iS == 48) {
                                this.showLoading = gd3Var.f();
                            } else if (iS == 56) {
                                this.quickLocation = gd3Var.f();
                            } else if (iS == 64) {
                                this.contactId = gd3Var.q();
                            } else if (!gd3Var.u(iS)) {
                            }
                        }
                    }
                    return this;
                }
            }

            public static final class Buttons extends fl9 {
                private static volatile Buttons[] _emptyArray;
                public Button[] button;

                public Buttons() {
                    clear();
                }

                public static Buttons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Buttons[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Buttons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Buttons) fl9.mergeFrom(new Buttons(), bArr);
                }

                public Buttons clear() {
                    this.button = Button.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    Button[] buttonArr = this.button;
                    int i = 0;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return i2;
                        }
                        Button button = buttonArr2[i];
                        if (button != null) {
                            i2 = hd3.i(1, button) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    Button[] buttonArr = this.button;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return;
                        }
                        Button button = buttonArr2[i];
                        if (button != null) {
                            hd3Var.y(1, button);
                        }
                        i++;
                    }
                }

                public static Buttons parseFrom(gd3 gd3Var) throws IOException {
                    return new Buttons().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Buttons mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int iB = coi.b(gd3Var, 10);
                            Button[] buttonArr = this.button;
                            int length = buttonArr == null ? 0 : buttonArr.length;
                            int i = iB + length;
                            Button[] buttonArr2 = new Button[i];
                            if (length != 0) {
                                System.arraycopy(buttonArr, 0, buttonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Button button = new Button();
                                buttonArr2[length] = button;
                                gd3Var.j(button);
                                gd3Var.s();
                                length++;
                            }
                            Button button2 = new Button();
                            buttonArr2[length] = button2;
                            gd3Var.j(button2);
                            this.button = buttonArr2;
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Call extends fl9 {
                public static final int AUDIO = 2;
                public static final int CANCELED = 2;
                public static final int HANGUP = 1;
                public static final int MISSED = 4;
                public static final int REJECTED = 3;
                public static final int UNKNOWN_CALL_TYPE = 0;
                public static final int UNKNOWN_HANGUP_TYPE = 0;
                public static final int VIDEO = 1;
                private static volatile Call[] _emptyArray;
                public int callType;
                public long[] contactIds;
                public String conversationId;
                public int duration;
                public long durationLong;
                public int hangupType;
                public String joinLink;

                public Call() {
                    clear();
                }

                public static Call[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Call[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Call parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Call) fl9.mergeFrom(new Call(), bArr);
                }

                public Call clear() {
                    this.conversationId = "";
                    this.callType = 0;
                    this.hangupType = 0;
                    this.duration = 0;
                    this.contactIds = coi.b;
                    this.durationLong = 0L;
                    this.joinLink = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long[] jArr;
                    int i = 0;
                    int iL = !this.conversationId.equals("") ? hd3.l(1, this.conversationId) : 0;
                    int i2 = this.callType;
                    if (i2 != 0) {
                        iL += hd3.f(2, i2);
                    }
                    int i3 = this.hangupType;
                    if (i3 != 0) {
                        iL += hd3.f(3, i3);
                    }
                    int i4 = this.duration;
                    if (i4 != 0) {
                        iL += hd3.f(4, i4);
                    }
                    long[] jArr2 = this.contactIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int iK = 0;
                        while (true) {
                            jArr = this.contactIds;
                            if (i >= jArr.length) {
                                break;
                            }
                            iK += hd3.k(jArr[i]);
                            i++;
                        }
                        iL = iL + iK + jArr.length;
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        iL += hd3.h(6, j);
                    }
                    return !this.joinLink.equals("") ? hd3.l(7, this.joinLink) + iL : iL;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (!this.conversationId.equals("")) {
                        hd3Var.E(1, this.conversationId);
                    }
                    int i = this.callType;
                    if (i != 0) {
                        hd3Var.w(2, i);
                    }
                    int i2 = this.hangupType;
                    if (i2 != 0) {
                        hd3Var.w(3, i2);
                    }
                    int i3 = this.duration;
                    if (i3 != 0) {
                        hd3Var.w(4, i3);
                    }
                    long[] jArr = this.contactIds;
                    if (jArr != null && jArr.length > 0) {
                        int i4 = 0;
                        while (true) {
                            long[] jArr2 = this.contactIds;
                            if (i4 >= jArr2.length) {
                                break;
                            }
                            hd3Var.x(5, jArr2[i4]);
                            i4++;
                        }
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        hd3Var.x(6, j);
                    }
                    if (this.joinLink.equals("")) {
                        return;
                    }
                    hd3Var.E(7, this.joinLink);
                }

                public static Call parseFrom(gd3 gd3Var) throws IOException {
                    return new Call().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Call mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.conversationId = gd3Var.r();
                        } else if (iS == 16) {
                            int iP = gd3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2) {
                                this.callType = iP;
                            }
                        } else if (iS == 24) {
                            int iP2 = gd3Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3 || iP2 == 4) {
                                this.hangupType = iP2;
                            }
                        } else if (iS == 32) {
                            this.duration = gd3Var.p();
                        } else if (iS == 40) {
                            int iB = coi.b(gd3Var, 40);
                            long[] jArr = this.contactIds;
                            int length = jArr == null ? 0 : jArr.length;
                            int i = iB + length;
                            long[] jArr2 = new long[i];
                            if (length != 0) {
                                System.arraycopy(jArr, 0, jArr2, 0, length);
                            }
                            while (length < i - 1) {
                                jArr2[length] = gd3Var.q();
                                gd3Var.s();
                                length++;
                            }
                            jArr2[length] = gd3Var.q();
                            this.contactIds = jArr2;
                        } else if (iS == 42) {
                            int iE = gd3Var.e(gd3Var.p());
                            int iC = gd3Var.c();
                            int i2 = 0;
                            while (gd3Var.b() > 0) {
                                gd3Var.q();
                                i2++;
                            }
                            gd3Var.t(iC);
                            long[] jArr3 = this.contactIds;
                            int length2 = jArr3 == null ? 0 : jArr3.length;
                            int i3 = i2 + length2;
                            long[] jArr4 = new long[i3];
                            if (length2 != 0) {
                                System.arraycopy(jArr3, 0, jArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                jArr4[length2] = gd3Var.q();
                                length2++;
                            }
                            this.contactIds = jArr4;
                            gd3Var.d(iE);
                        } else if (iS == 48) {
                            this.durationLong = gd3Var.q();
                        } else if (iS == 58) {
                            this.joinLink = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Contact extends fl9 {
                private static volatile Contact[] _emptyArray;
                public long contactId;
                public String firstName;
                public String lastName;
                public String localPhotoUrl;
                public String name;
                public String phone;
                public String photoUrl;
                public String vcfBody;

                public Contact() {
                    clear();
                }

                public static Contact[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Contact[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Contact) fl9.mergeFrom(new Contact(), bArr);
                }

                public Contact clear() {
                    this.vcfBody = "";
                    this.contactId = 0L;
                    this.name = "";
                    this.phone = "";
                    this.photoUrl = "";
                    this.localPhotoUrl = "";
                    this.firstName = "";
                    this.lastName = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int iL = !this.vcfBody.equals("") ? hd3.l(1, this.vcfBody) : 0;
                    long j = this.contactId;
                    if (j != 0) {
                        iL += hd3.h(2, j);
                    }
                    if (!this.name.equals("")) {
                        iL += hd3.l(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        iL += hd3.l(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        iL += hd3.l(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        iL += hd3.l(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        iL += hd3.l(7, this.firstName);
                    }
                    return !this.lastName.equals("") ? hd3.l(8, this.lastName) + iL : iL;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (!this.vcfBody.equals("")) {
                        hd3Var.E(1, this.vcfBody);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        hd3Var.x(2, j);
                    }
                    if (!this.name.equals("")) {
                        hd3Var.E(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        hd3Var.E(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        hd3Var.E(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        hd3Var.E(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        hd3Var.E(7, this.firstName);
                    }
                    if (this.lastName.equals("")) {
                        return;
                    }
                    hd3Var.E(8, this.lastName);
                }

                public static Contact parseFrom(gd3 gd3Var) throws IOException {
                    return new Contact().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Contact mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.vcfBody = gd3Var.r();
                        } else if (iS == 16) {
                            this.contactId = gd3Var.q();
                        } else if (iS == 26) {
                            this.name = gd3Var.r();
                        } else if (iS == 34) {
                            this.phone = gd3Var.r();
                        } else if (iS == 42) {
                            this.photoUrl = gd3Var.r();
                        } else if (iS == 50) {
                            this.localPhotoUrl = gd3Var.r();
                        } else if (iS == 58) {
                            this.firstName = gd3Var.r();
                        } else if (iS == 66) {
                            this.lastName = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Control extends fl9 {
                public static final int ADD = 2;
                public static final int BOT_STARTED = 11;
                public static final int CHANNEL_TYPE = 2;
                public static final int CHAT_TYPE = 1;
                public static final int DIALOG = 4;
                public static final int GROUP_CHAT_TYPE = 3;
                public static final int HELLO = 7;
                public static final int ICON = 6;
                public static final int JOIN_BY_LINK = 9;
                public static final int LEAVE = 4;
                public static final int NEW = 1;
                public static final int PIN = 10;
                public static final int REMOVE = 3;
                public static final int SYSTEM = 8;
                public static final int TITLE = 5;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                private static volatile Control[] _emptyArray;
                public int chatType;
                public Rect crop;
                public int event;
                public String fullUrl;
                public String iconToken;
                public String message;
                public long pinnedMessageId;
                public long pinnedMessageServerId;
                public String shortMessage;
                public boolean showHistory;
                public String startPayload;
                public String title;
                public String url;
                public long userId;
                public long[] userIds;

                public Control() {
                    clear();
                }

                public static Control[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Control[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Control) fl9.mergeFrom(new Control(), bArr);
                }

                public Control clear() {
                    this.event = 0;
                    this.userId = 0L;
                    this.userIds = coi.b;
                    this.title = "";
                    this.iconToken = "";
                    this.url = "";
                    this.crop = null;
                    this.message = "";
                    this.shortMessage = "";
                    this.showHistory = false;
                    this.chatType = 0;
                    this.fullUrl = "";
                    this.pinnedMessageId = 0L;
                    this.pinnedMessageServerId = 0L;
                    this.startPayload = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long[] jArr;
                    int i = this.event;
                    int i2 = 0;
                    int iF = i != 0 ? hd3.f(1, i) : 0;
                    long j = this.userId;
                    if (j != 0) {
                        iF += hd3.h(2, j);
                    }
                    long[] jArr2 = this.userIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int iK = 0;
                        while (true) {
                            jArr = this.userIds;
                            if (i2 >= jArr.length) {
                                break;
                            }
                            iK += hd3.k(jArr[i2]);
                            i2++;
                        }
                        iF = iF + iK + jArr.length;
                    }
                    if (!this.title.equals("")) {
                        iF += hd3.l(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        iF += hd3.l(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        iF += hd3.l(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        iF += hd3.i(7, rect);
                    }
                    if (!this.message.equals("")) {
                        iF += hd3.l(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        iF += hd3.l(9, this.shortMessage);
                    }
                    if (this.showHistory) {
                        iF += hd3.a(10);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        iF += hd3.f(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        iF += hd3.l(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        iF += hd3.h(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        iF += hd3.h(14, j3);
                    }
                    return !this.startPayload.equals("") ? hd3.l(16, this.startPayload) + iF : iF;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    int i = this.event;
                    if (i != 0) {
                        hd3Var.w(1, i);
                    }
                    long j = this.userId;
                    if (j != 0) {
                        hd3Var.x(2, j);
                    }
                    long[] jArr = this.userIds;
                    if (jArr != null && jArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            long[] jArr2 = this.userIds;
                            if (i2 >= jArr2.length) {
                                break;
                            }
                            hd3Var.x(3, jArr2[i2]);
                            i2++;
                        }
                    }
                    if (!this.title.equals("")) {
                        hd3Var.E(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        hd3Var.E(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        hd3Var.E(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        hd3Var.y(7, rect);
                    }
                    if (!this.message.equals("")) {
                        hd3Var.E(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        hd3Var.E(9, this.shortMessage);
                    }
                    boolean z = this.showHistory;
                    if (z) {
                        hd3Var.r(10, z);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        hd3Var.w(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        hd3Var.E(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        hd3Var.x(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        hd3Var.x(14, j3);
                    }
                    if (this.startPayload.equals("")) {
                        return;
                    }
                    hd3Var.E(16, this.startPayload);
                }

                public static Control parseFrom(gd3 gd3Var) throws IOException {
                    return new Control().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Control mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                int iP = gd3Var.p();
                                switch (iP) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                        this.event = iP;
                                        break;
                                }
                            case 16:
                                this.userId = gd3Var.q();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                int iB = coi.b(gd3Var, 24);
                                long[] jArr = this.userIds;
                                int length = jArr == null ? 0 : jArr.length;
                                int i = iB + length;
                                long[] jArr2 = new long[i];
                                if (length != 0) {
                                    System.arraycopy(jArr, 0, jArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    jArr2[length] = gd3Var.q();
                                    gd3Var.s();
                                    length++;
                                }
                                jArr2[length] = gd3Var.q();
                                this.userIds = jArr2;
                                break;
                            case 26:
                                int iE = gd3Var.e(gd3Var.p());
                                int iC = gd3Var.c();
                                int i2 = 0;
                                while (gd3Var.b() > 0) {
                                    gd3Var.q();
                                    i2++;
                                }
                                gd3Var.t(iC);
                                long[] jArr3 = this.userIds;
                                int length2 = jArr3 == null ? 0 : jArr3.length;
                                int i3 = i2 + length2;
                                long[] jArr4 = new long[i3];
                                if (length2 != 0) {
                                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                                }
                                while (length2 < i3) {
                                    jArr4[length2] = gd3Var.q();
                                    length2++;
                                }
                                this.userIds = jArr4;
                                gd3Var.d(iE);
                                break;
                            case 34:
                                this.title = gd3Var.r();
                                break;
                            case 42:
                                this.iconToken = gd3Var.r();
                                break;
                            case 50:
                                this.url = gd3Var.r();
                                break;
                            case 58:
                                if (this.crop == null) {
                                    this.crop = new Rect();
                                }
                                gd3Var.j(this.crop);
                                break;
                            case 66:
                                this.message = gd3Var.r();
                                break;
                            case 74:
                                this.shortMessage = gd3Var.r();
                                break;
                            case 80:
                                this.showHistory = gd3Var.f();
                                break;
                            case 88:
                                int iP2 = gd3Var.p();
                                if (iP2 != 0 && iP2 != 1 && iP2 != 2 && iP2 != 3 && iP2 != 4) {
                                    break;
                                } else {
                                    this.chatType = iP2;
                                    break;
                                }
                                break;
                            case 98:
                                this.fullUrl = gd3Var.r();
                                break;
                            case 104:
                                this.pinnedMessageId = gd3Var.q();
                                break;
                            case 112:
                                this.pinnedMessageServerId = gd3Var.q();
                                break;
                            case 130:
                                this.startPayload = gd3Var.r();
                                break;
                            default:
                                if (!gd3Var.u(iS)) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return this;
                }
            }

            public static final class File extends fl9 {
                private static volatile File[] _emptyArray;
                public long fileId;
                public String name;
                public Attach preview;
                public long size;
                public String token;

                public File() {
                    clear();
                }

                public static File[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new File[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (File) fl9.mergeFrom(new File(), bArr);
                }

                public File clear() {
                    this.fileId = 0L;
                    this.size = 0L;
                    this.name = "";
                    this.preview = null;
                    this.token = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.fileId;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    long j2 = this.size;
                    if (j2 != 0) {
                        iH += hd3.h(2, j2);
                    }
                    if (!this.name.equals("")) {
                        iH += hd3.l(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        iH += hd3.i(4, attach);
                    }
                    return !this.token.equals("") ? hd3.l(5, this.token) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.fileId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    long j2 = this.size;
                    if (j2 != 0) {
                        hd3Var.x(2, j2);
                    }
                    if (!this.name.equals("")) {
                        hd3Var.E(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        hd3Var.y(4, attach);
                    }
                    if (this.token.equals("")) {
                        return;
                    }
                    hd3Var.E(5, this.token);
                }

                public static File parseFrom(gd3 gd3Var) throws IOException {
                    return new File().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public File mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.fileId = gd3Var.q();
                        } else if (iS == 16) {
                            this.size = gd3Var.q();
                        } else if (iS == 26) {
                            this.name = gd3Var.r();
                        } else if (iS == 34) {
                            if (this.preview == null) {
                                this.preview = new Attach();
                            }
                            gd3Var.j(this.preview);
                        } else if (iS == 42) {
                            this.token = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class InlineKeyboard extends fl9 {
                private static volatile InlineKeyboard[] _emptyArray;
                public Buttons[] buttons;
                public String callbackId;

                public InlineKeyboard() {
                    clear();
                }

                public static InlineKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new InlineKeyboard[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static InlineKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (InlineKeyboard) fl9.mergeFrom(new InlineKeyboard(), bArr);
                }

                public InlineKeyboard clear() {
                    this.buttons = Buttons.emptyArray();
                    this.callbackId = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    Buttons[] buttonsArr = this.buttons;
                    int i = 0;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons = buttonsArr2[i];
                            if (buttons != null) {
                                i2 = hd3.i(1, buttons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return !this.callbackId.equals("") ? hd3.l(2, this.callbackId) + i : i;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    Buttons[] buttonsArr = this.buttons;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons = buttonsArr2[i];
                            if (buttons != null) {
                                hd3Var.y(1, buttons);
                            }
                            i++;
                        }
                    }
                    if (this.callbackId.equals("")) {
                        return;
                    }
                    hd3Var.E(2, this.callbackId);
                }

                public static InlineKeyboard parseFrom(gd3 gd3Var) throws IOException {
                    return new InlineKeyboard().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public InlineKeyboard mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int iB = coi.b(gd3Var, 10);
                            Buttons[] buttonsArr = this.buttons;
                            int length = buttonsArr == null ? 0 : buttonsArr.length;
                            int i = iB + length;
                            Buttons[] buttonsArr2 = new Buttons[i];
                            if (length != 0) {
                                System.arraycopy(buttonsArr, 0, buttonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Buttons buttons = new Buttons();
                                buttonsArr2[length] = buttons;
                                gd3Var.j(buttons);
                                gd3Var.s();
                                length++;
                            }
                            Buttons buttons2 = new Buttons();
                            buttonsArr2[length] = buttons2;
                            gd3Var.j(buttons2);
                            this.buttons = buttonsArr2;
                        } else if (iS == 18) {
                            this.callbackId = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Location extends fl9 {
                private static volatile Location[] _emptyArray;
                public float accuracy;
                public double altitude;
                public float bearing;
                public boolean corrupted;
                public String deviceId;
                public long endTime;
                public LocationInfo lastLocation;
                public double latitude;
                public long livePeriod;
                public double longitude;
                public float speed;
                public long startTime;
                public LocationInfo[] track;
                public long ttl;
                public float zoom;

                public Location() {
                    clear();
                }

                public static Location[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Location[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Location) fl9.mergeFrom(new Location(), bArr);
                }

                public Location clear() {
                    this.latitude = 0.0d;
                    this.longitude = 0.0d;
                    this.zoom = 0.0f;
                    this.ttl = 0L;
                    this.livePeriod = 0L;
                    this.track = LocationInfo.emptyArray();
                    this.deviceId = "";
                    this.lastLocation = null;
                    this.altitude = 0.0d;
                    this.accuracy = 0.0f;
                    this.bearing = 0.0f;
                    this.speed = 0.0f;
                    this.corrupted = false;
                    this.startTime = 0L;
                    this.endTime = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int i = 0;
                    int iC = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? hd3.c(1) : 0;
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        iC += hd3.c(2);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        iC += hd3.e(3);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        iC += hd3.h(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        iC += hd3.h(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                iC = hd3.i(6, locationInfo) + iC;
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        iC += hd3.l(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        iC += hd3.i(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        iC += hd3.c(9);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        iC += hd3.e(10);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        iC += hd3.e(11);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        iC += hd3.e(12);
                    }
                    if (this.corrupted) {
                        iC += hd3.a(13);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        iC += hd3.h(14, j3);
                    }
                    long j4 = this.endTime;
                    return j4 != 0 ? hd3.h(15, j4) + iC : iC;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                        hd3Var.t(1, this.latitude);
                    }
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        hd3Var.t(2, this.longitude);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(3, this.zoom);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        hd3Var.x(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        hd3Var.x(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        int i = 0;
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                hd3Var.y(6, locationInfo);
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        hd3Var.E(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        hd3Var.y(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        hd3Var.t(9, this.altitude);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(10, this.accuracy);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(11, this.bearing);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(12, this.speed);
                    }
                    boolean z = this.corrupted;
                    if (z) {
                        hd3Var.r(13, z);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        hd3Var.x(14, j3);
                    }
                    long j4 = this.endTime;
                    if (j4 != 0) {
                        hd3Var.x(15, j4);
                    }
                }

                public static Location parseFrom(gd3 gd3Var) throws IOException {
                    return new Location().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Location mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 9:
                                this.latitude = gd3Var.h();
                                break;
                            case LangUtils.HASH_SEED /* 17 */:
                                this.longitude = gd3Var.h();
                                break;
                            case 29:
                                this.zoom = gd3Var.i();
                                break;
                            case 32:
                                this.ttl = gd3Var.q();
                                break;
                            case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                                this.livePeriod = gd3Var.q();
                                break;
                            case 50:
                                int iB = coi.b(gd3Var, 50);
                                LocationInfo[] locationInfoArr = this.track;
                                int length = locationInfoArr == null ? 0 : locationInfoArr.length;
                                int i = iB + length;
                                LocationInfo[] locationInfoArr2 = new LocationInfo[i];
                                if (length != 0) {
                                    System.arraycopy(locationInfoArr, 0, locationInfoArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    LocationInfo locationInfo = new LocationInfo();
                                    locationInfoArr2[length] = locationInfo;
                                    gd3Var.j(locationInfo);
                                    gd3Var.s();
                                    length++;
                                }
                                LocationInfo locationInfo2 = new LocationInfo();
                                locationInfoArr2[length] = locationInfo2;
                                gd3Var.j(locationInfo2);
                                this.track = locationInfoArr2;
                                break;
                            case 58:
                                this.deviceId = gd3Var.r();
                                break;
                            case 66:
                                if (this.lastLocation == null) {
                                    this.lastLocation = new LocationInfo();
                                }
                                gd3Var.j(this.lastLocation);
                                break;
                            case 73:
                                this.altitude = gd3Var.h();
                                break;
                            case 85:
                                this.accuracy = gd3Var.i();
                                break;
                            case 93:
                                this.bearing = gd3Var.i();
                                break;
                            case HttpStatus.SC_SWITCHING_PROTOCOLS /* 101 */:
                                this.speed = gd3Var.i();
                                break;
                            case 104:
                                this.corrupted = gd3Var.f();
                                break;
                            case 112:
                                this.startTime = gd3Var.q();
                                break;
                            case 120:
                                this.endTime = gd3Var.q();
                                break;
                            default:
                                if (!gd3Var.u(iS)) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return this;
                }
            }

            public static final class Photo extends fl9 {
                private static volatile Photo[] _emptyArray;
                public String baseUrl;
                public String externalGifId;
                public boolean gif;
                public int height;
                public String mp4Url;
                public long photoId;
                public String photoToken;
                public String photoUrl;
                public byte[] previewData;
                public String previewUrl;
                public int width;

                public Photo() {
                    clear();
                }

                public static Photo[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Photo[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Photo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Photo) fl9.mergeFrom(new Photo(), bArr);
                }

                public Photo clear() {
                    this.photoUrl = "";
                    this.width = 0;
                    this.height = 0;
                    this.gif = false;
                    this.previewData = coi.e;
                    this.photoToken = "";
                    this.photoId = 0L;
                    this.mp4Url = "";
                    this.baseUrl = "";
                    this.externalGifId = "";
                    this.previewUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int iL = !this.photoUrl.equals("") ? hd3.l(1, this.photoUrl) : 0;
                    int i = this.width;
                    if (i != 0) {
                        iL += hd3.f(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        iL += hd3.f(3, i2);
                    }
                    if (this.gif) {
                        iL += hd3.a(4);
                    }
                    if (!Arrays.equals(this.previewData, coi.e)) {
                        iL += hd3.b(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        iL += hd3.l(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        iL += hd3.h(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        iL += hd3.l(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        iL += hd3.l(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        iL += hd3.l(11, this.externalGifId);
                    }
                    return !this.previewUrl.equals("") ? hd3.l(12, this.previewUrl) + iL : iL;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (!this.photoUrl.equals("")) {
                        hd3Var.E(1, this.photoUrl);
                    }
                    int i = this.width;
                    if (i != 0) {
                        hd3Var.w(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        hd3Var.w(3, i2);
                    }
                    boolean z = this.gif;
                    if (z) {
                        hd3Var.r(4, z);
                    }
                    if (!Arrays.equals(this.previewData, coi.e)) {
                        hd3Var.s(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        hd3Var.E(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        hd3Var.x(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        hd3Var.E(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        hd3Var.E(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        hd3Var.E(11, this.externalGifId);
                    }
                    if (this.previewUrl.equals("")) {
                        return;
                    }
                    hd3Var.E(12, this.previewUrl);
                }

                public static Photo parseFrom(gd3 gd3Var) throws IOException {
                    return new Photo().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Photo mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 10:
                                this.photoUrl = gd3Var.r();
                                break;
                            case 16:
                                this.width = gd3Var.p();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                this.height = gd3Var.p();
                                break;
                            case 32:
                                this.gif = gd3Var.f();
                                break;
                            case 42:
                                this.previewData = gd3Var.g();
                                break;
                            case 50:
                                this.photoToken = gd3Var.r();
                                break;
                            case 56:
                                this.photoId = gd3Var.q();
                                break;
                            case 66:
                                this.mp4Url = gd3Var.r();
                                break;
                            case 82:
                                this.baseUrl = gd3Var.r();
                                break;
                            case 90:
                                this.externalGifId = gd3Var.r();
                                break;
                            case 98:
                                this.previewUrl = gd3Var.r();
                                break;
                            default:
                                if (!gd3Var.u(iS)) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return this;
                }
            }

            public static final class Present extends fl9 {
                public static final int ACCEPTED = 3;
                public static final int ACCEPTING = 5;
                public static final int DECLINED = 4;
                public static final int NEW = 1;
                public static final int RECEIVED = 2;
                public static final int UNKNOWN = 0;
                private static volatile Present[] _emptyArray;
                public long metadataId;
                public long presentId;
                public String presentJson;
                public long receiverId;
                public long senderId;
                public int status;

                public Present() {
                    clear();
                }

                public static Present[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Present[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Present parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Present) fl9.mergeFrom(new Present(), bArr);
                }

                public Present clear() {
                    this.presentId = 0L;
                    this.metadataId = 0L;
                    this.senderId = 0L;
                    this.receiverId = 0L;
                    this.status = 0;
                    this.presentJson = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.presentId;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        iH += hd3.h(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        iH += hd3.h(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        iH += hd3.h(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        iH += hd3.f(5, i);
                    }
                    return !this.presentJson.equals("") ? hd3.l(6, this.presentJson) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.presentId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        hd3Var.x(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        hd3Var.x(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        hd3Var.x(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        hd3Var.w(5, i);
                    }
                    if (this.presentJson.equals("")) {
                        return;
                    }
                    hd3Var.E(6, this.presentJson);
                }

                public static Present parseFrom(gd3 gd3Var) throws IOException {
                    return new Present().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Present mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.presentId = gd3Var.q();
                        } else if (iS == 16) {
                            this.metadataId = gd3Var.q();
                        } else if (iS == 24) {
                            this.senderId = gd3Var.q();
                        } else if (iS == 32) {
                            this.receiverId = gd3Var.q();
                        } else if (iS == 40) {
                            int iP = gd3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4 || iP == 5) {
                                this.status = iP;
                            }
                        } else if (iS == 50) {
                            this.presentJson = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Rect extends fl9 {
                private static volatile Rect[] _emptyArray;
                public float bottom;
                public float left;
                public float right;
                public float top;

                public Rect() {
                    clear();
                }

                public static Rect[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Rect[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Rect) fl9.mergeFrom(new Rect(), bArr);
                }

                public Rect clear() {
                    this.left = 0.0f;
                    this.top = 0.0f;
                    this.right = 0.0f;
                    this.bottom = 0.0f;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int iE = Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f) ? hd3.e(1) : 0;
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        iE += hd3.e(2);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        iE += hd3.e(3);
                    }
                    return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f) ? hd3.e(4) + iE : iE;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (Float.floatToIntBits(this.left) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(1, this.left);
                    }
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(2, this.top);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(3, this.right);
                    }
                    if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(0.0f)) {
                        hd3Var.v(4, this.bottom);
                    }
                }

                public static Rect parseFrom(gd3 gd3Var) throws IOException {
                    return new Rect().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Rect mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 13) {
                            this.left = gd3Var.i();
                        } else if (iS == 21) {
                            this.top = gd3Var.i();
                        } else if (iS == 29) {
                            this.right = gd3Var.i();
                        } else if (iS == 37) {
                            this.bottom = gd3Var.i();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class ReplyButton extends fl9 {
                public static final int CONTACT = 2;
                public static final int DEFAULT = 0;
                public static final int IMAGE = 1;
                public static final int LOCATION = 3;
                public static final int MESSAGE = 0;
                public static final int NEGATIVE = 2;
                public static final int POSITIVE = 1;
                public static final int UNKNOWN = 4;
                public static final int UNKNOWN_INTENT = 3;
                private static volatile ReplyButton[] _emptyArray;
                public Photo image;
                public int intent;
                public long outgoingMessageId;
                public String text;
                public int type;

                public ReplyButton() {
                    clear();
                }

                public static ReplyButton[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButton[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButton) fl9.mergeFrom(new ReplyButton(), bArr);
                }

                public ReplyButton clear() {
                    this.text = "";
                    this.type = 0;
                    this.intent = 0;
                    this.image = null;
                    this.outgoingMessageId = 0L;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int iL = !this.text.equals("") ? hd3.l(1, this.text) : 0;
                    int i = this.type;
                    if (i != 0) {
                        iL += hd3.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        iL += hd3.f(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        iL += hd3.i(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    return j != 0 ? hd3.h(5, j) + iL : iL;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (!this.text.equals("")) {
                        hd3Var.E(1, this.text);
                    }
                    int i = this.type;
                    if (i != 0) {
                        hd3Var.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        hd3Var.w(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        hd3Var.y(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    if (j != 0) {
                        hd3Var.x(5, j);
                    }
                }

                public static ReplyButton parseFrom(gd3 gd3Var) throws IOException {
                    return new ReplyButton().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public ReplyButton mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.text = gd3Var.r();
                        } else if (iS == 16) {
                            int iP = gd3Var.p();
                            if (iP == 0 || iP == 1 || iP == 2 || iP == 3 || iP == 4) {
                                this.type = iP;
                            }
                        } else if (iS == 24) {
                            int iP2 = gd3Var.p();
                            if (iP2 == 0 || iP2 == 1 || iP2 == 2 || iP2 == 3) {
                                this.intent = iP2;
                            }
                        } else if (iS == 34) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            gd3Var.j(this.image);
                        } else if (iS == 40) {
                            this.outgoingMessageId = gd3Var.q();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class ReplyButtons extends fl9 {
                private static volatile ReplyButtons[] _emptyArray;
                public ReplyButton[] replyButton;

                public ReplyButtons() {
                    clear();
                }

                public static ReplyButtons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButtons[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButtons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButtons) fl9.mergeFrom(new ReplyButtons(), bArr);
                }

                public ReplyButtons clear() {
                    this.replyButton = ReplyButton.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    int i = 0;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return i2;
                        }
                        ReplyButton replyButton = replyButtonArr2[i];
                        if (replyButton != null) {
                            i2 = hd3.i(1, replyButton) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return;
                        }
                        ReplyButton replyButton = replyButtonArr2[i];
                        if (replyButton != null) {
                            hd3Var.y(1, replyButton);
                        }
                        i++;
                    }
                }

                public static ReplyButtons parseFrom(gd3 gd3Var) throws IOException {
                    return new ReplyButtons().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public ReplyButtons mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int iB = coi.b(gd3Var, 10);
                            ReplyButton[] replyButtonArr = this.replyButton;
                            int length = replyButtonArr == null ? 0 : replyButtonArr.length;
                            int i = iB + length;
                            ReplyButton[] replyButtonArr2 = new ReplyButton[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonArr, 0, replyButtonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButton replyButton = new ReplyButton();
                                replyButtonArr2[length] = replyButton;
                                gd3Var.j(replyButton);
                                gd3Var.s();
                                length++;
                            }
                            ReplyButton replyButton2 = new ReplyButton();
                            replyButtonArr2[length] = replyButton2;
                            gd3Var.j(replyButton2);
                            this.replyButton = replyButtonArr2;
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class ReplyKeyboard extends fl9 {
                private static volatile ReplyKeyboard[] _emptyArray;
                public ReplyButtons[] buttons;
                public boolean defaultInputDisabled;

                public ReplyKeyboard() {
                    clear();
                }

                public static ReplyKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyKeyboard[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyKeyboard) fl9.mergeFrom(new ReplyKeyboard(), bArr);
                }

                public ReplyKeyboard clear() {
                    this.buttons = ReplyButtons.emptyArray();
                    this.defaultInputDisabled = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    int i = 0;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                i2 = hd3.i(1, replyButtons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return this.defaultInputDisabled ? hd3.a(2) + i : i;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                hd3Var.y(1, replyButtons);
                            }
                            i++;
                        }
                    }
                    boolean z = this.defaultInputDisabled;
                    if (z) {
                        hd3Var.r(2, z);
                    }
                }

                public static ReplyKeyboard parseFrom(gd3 gd3Var) throws IOException {
                    return new ReplyKeyboard().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public ReplyKeyboard mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int iB = coi.b(gd3Var, 10);
                            ReplyButtons[] replyButtonsArr = this.buttons;
                            int length = replyButtonsArr == null ? 0 : replyButtonsArr.length;
                            int i = iB + length;
                            ReplyButtons[] replyButtonsArr2 = new ReplyButtons[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonsArr, 0, replyButtonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButtons replyButtons = new ReplyButtons();
                                replyButtonsArr2[length] = replyButtons;
                                gd3Var.j(replyButtons);
                                gd3Var.s();
                                length++;
                            }
                            ReplyButtons replyButtons2 = new ReplyButtons();
                            replyButtonsArr2[length] = replyButtons2;
                            gd3Var.j(replyButtons2);
                            this.buttons = replyButtonsArr2;
                        } else if (iS == 16) {
                            this.defaultInputDisabled = gd3Var.f();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class SendAction extends fl9 {
                private static volatile SendAction[] _emptyArray;
                public String actionDestinationType;
                public String backgroundColor;
                public String contentType;
                public String context;
                public String nextContentType;
                public String textColor;
                public String title;

                public SendAction() {
                    clear();
                }

                public static SendAction[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new SendAction[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static SendAction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (SendAction) fl9.mergeFrom(new SendAction(), bArr);
                }

                public SendAction clear() {
                    this.contentType = "";
                    this.title = "";
                    this.nextContentType = "";
                    this.textColor = "";
                    this.backgroundColor = "";
                    this.context = "";
                    this.actionDestinationType = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    int iL = !this.contentType.equals("") ? hd3.l(1, this.contentType) : 0;
                    if (!this.title.equals("")) {
                        iL += hd3.l(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        iL += hd3.l(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        iL += hd3.l(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        iL += hd3.l(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        iL += hd3.l(6, this.context);
                    }
                    return !this.actionDestinationType.equals("") ? hd3.l(7, this.actionDestinationType) + iL : iL;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    if (!this.contentType.equals("")) {
                        hd3Var.E(1, this.contentType);
                    }
                    if (!this.title.equals("")) {
                        hd3Var.E(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        hd3Var.E(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        hd3Var.E(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        hd3Var.E(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        hd3Var.E(6, this.context);
                    }
                    if (this.actionDestinationType.equals("")) {
                        return;
                    }
                    hd3Var.E(7, this.actionDestinationType);
                }

                public static SendAction parseFrom(gd3 gd3Var) throws IOException {
                    return new SendAction().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public SendAction mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            this.contentType = gd3Var.r();
                        } else if (iS == 18) {
                            this.title = gd3Var.r();
                        } else if (iS == 26) {
                            this.nextContentType = gd3Var.r();
                        } else if (iS == 34) {
                            this.textColor = gd3Var.r();
                        } else if (iS == 42) {
                            this.backgroundColor = gd3Var.r();
                        } else if (iS == 50) {
                            this.context = gd3Var.r();
                        } else if (iS == 58) {
                            this.actionDestinationType = gd3Var.r();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public static final class Share extends fl9 {
                private static volatile Share[] _emptyArray;
                public boolean contentLevel;
                public boolean deleted;
                public String description;
                public String host;
                public Photo image;
                public Attach media;
                public long shareId;
                public String title;
                public String token;
                public String url;

                public Share() {
                    clear();
                }

                public static Share[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Share[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Share parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Share) fl9.mergeFrom(new Share(), bArr);
                }

                public Share clear() {
                    this.shareId = 0L;
                    this.token = "";
                    this.url = "";
                    this.title = "";
                    this.description = "";
                    this.host = "";
                    this.image = null;
                    this.media = null;
                    this.deleted = false;
                    this.contentLevel = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.shareId;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    if (!this.token.equals("")) {
                        iH += hd3.l(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        iH += hd3.l(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        iH += hd3.l(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        iH += hd3.l(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        iH += hd3.l(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        iH += hd3.i(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        iH += hd3.i(8, attach);
                    }
                    if (this.deleted) {
                        iH += hd3.a(9);
                    }
                    return this.contentLevel ? hd3.a(10) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.shareId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    if (!this.token.equals("")) {
                        hd3Var.E(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        hd3Var.E(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        hd3Var.E(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        hd3Var.E(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        hd3Var.E(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        hd3Var.y(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        hd3Var.y(8, attach);
                    }
                    boolean z = this.deleted;
                    if (z) {
                        hd3Var.r(9, z);
                    }
                    boolean z2 = this.contentLevel;
                    if (z2) {
                        hd3Var.r(10, z2);
                    }
                }

                public static Share parseFrom(gd3 gd3Var) throws IOException {
                    return new Share().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Share mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                this.shareId = gd3Var.q();
                                break;
                            case 18:
                                this.token = gd3Var.r();
                                break;
                            case 26:
                                this.url = gd3Var.r();
                                break;
                            case 34:
                                this.title = gd3Var.r();
                                break;
                            case 42:
                                this.description = gd3Var.r();
                                break;
                            case 50:
                                this.host = gd3Var.r();
                                break;
                            case 58:
                                if (this.image == null) {
                                    this.image = new Photo();
                                }
                                gd3Var.j(this.image);
                                break;
                            case 66:
                                if (this.media == null) {
                                    this.media = new Attach();
                                }
                                gd3Var.j(this.media);
                                break;
                            case 72:
                                this.deleted = gd3Var.f();
                                break;
                            case 80:
                                this.contentLevel = gd3Var.f();
                                break;
                            default:
                                if (!gd3Var.u(iS)) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return this;
                }
            }

            public static final class Sticker extends fl9 {
                public static final int LIVE = 2;
                public static final int LOTTIE = 4;
                public static final int POSTCARD = 3;
                public static final int STATIC = 1;
                public static final int SYSTEM = 1;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                public static final int USER = 2;
                private static volatile Sticker[] _emptyArray;
                public boolean audio;
                public int authorType;
                public String firstUrl;
                public int height;
                public String lottieUrl;
                public String mp4Url;
                public String previewUrl;
                public long setId;
                public long stickerId;
                public int stickerType;
                public String[] tags;
                public long updateTime;
                public String url;
                public String videoUrl;
                public int width;

                public static final class AnimationProperties extends fl9 {
                    private static volatile AnimationProperties[] _emptyArray;
                    public int duration;
                    public int fps;
                    public Map<Integer, Integer> frameRepeats;
                    public int framesCount;
                    public int replayDelay;

                    public AnimationProperties() {
                        clear();
                    }

                    public static AnimationProperties[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (kp7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new AnimationProperties[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static AnimationProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (AnimationProperties) fl9.mergeFrom(new AnimationProperties(), bArr);
                    }

                    public AnimationProperties clear() {
                        this.framesCount = 0;
                        this.fps = 0;
                        this.duration = 0;
                        this.replayDelay = 0;
                        this.frameRepeats = null;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.fl9
                    public int computeSerializedSize() {
                        int i = this.framesCount;
                        int iF = i != 0 ? hd3.f(1, i) : 0;
                        int i2 = this.fps;
                        if (i2 != 0) {
                            iF += hd3.f(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            iF += hd3.f(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            iF += hd3.f(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        return map != null ? kp7.a(map, 5, 5, 5) + iF : iF;
                    }

                    @Override // defpackage.fl9
                    public AnimationProperties mergeFrom(gd3 gd3Var) throws IOException {
                        gd3 gd3Var2;
                        tn8 tn8Var = jei.a;
                        while (true) {
                            int iS = gd3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                gd3Var2 = gd3Var;
                                this.framesCount = gd3Var2.p();
                            } else if (iS == 16) {
                                gd3Var2 = gd3Var;
                                this.fps = gd3Var2.p();
                            } else if (iS == 24) {
                                gd3Var2 = gd3Var;
                                this.duration = gd3Var2.p();
                            } else if (iS == 32) {
                                gd3Var2 = gd3Var;
                                this.replayDelay = gd3Var2.p();
                            } else if (iS == 42) {
                                gd3Var2 = gd3Var;
                                this.frameRepeats = kp7.b(gd3Var2, this.frameRepeats, tn8Var, 5, 5, null, 8, 16);
                            } else {
                                if (!gd3Var.u(iS)) {
                                    break;
                                }
                                gd3Var2 = gd3Var;
                            }
                            gd3Var = gd3Var2;
                        }
                        return this;
                    }

                    @Override // defpackage.fl9
                    public void writeTo(hd3 hd3Var) throws IOException {
                        int i = this.framesCount;
                        if (i != 0) {
                            hd3Var.w(1, i);
                        }
                        int i2 = this.fps;
                        if (i2 != 0) {
                            hd3Var.w(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            hd3Var.w(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            hd3Var.w(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        if (map != null) {
                            kp7.d(hd3Var, map, 5, 5, 5);
                        }
                    }

                    public static AnimationProperties parseFrom(gd3 gd3Var) throws IOException {
                        return new AnimationProperties().mergeFrom(gd3Var);
                    }
                }

                public Sticker() {
                    clear();
                }

                public static Sticker[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Sticker[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Sticker parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Sticker) fl9.mergeFrom(new Sticker(), bArr);
                }

                public Sticker clear() {
                    this.stickerId = 0L;
                    this.url = "";
                    this.width = 0;
                    this.height = 0;
                    this.mp4Url = "";
                    this.firstUrl = "";
                    this.tags = coi.d;
                    this.previewUrl = "";
                    this.updateTime = 0L;
                    this.stickerType = 0;
                    this.setId = 0L;
                    this.lottieUrl = "";
                    this.audio = false;
                    this.authorType = 0;
                    this.videoUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.stickerId;
                    int i = 0;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        iH += hd3.l(2, this.url);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        iH += hd3.f(3, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        iH += hd3.f(4, i3);
                    }
                    if (!this.mp4Url.equals("")) {
                        iH += hd3.l(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        iH += hd3.l(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int iJ = 0;
                        int i4 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i];
                            if (str != null) {
                                i4++;
                                int iQ = hd3.q(str);
                                iJ = hd3.j(iQ) + iQ + iJ;
                            }
                            i++;
                        }
                        iH = iH + iJ + i4;
                    }
                    if (!this.previewUrl.equals("")) {
                        iH += hd3.l(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        iH += hd3.h(10, j2);
                    }
                    int i5 = this.stickerType;
                    if (i5 != 0) {
                        iH += hd3.f(13, i5);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        iH += hd3.h(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        iH += hd3.l(16, this.lottieUrl);
                    }
                    if (this.audio) {
                        iH += hd3.a(17);
                    }
                    int i6 = this.authorType;
                    if (i6 != 0) {
                        iH += hd3.f(18, i6);
                    }
                    return !this.videoUrl.equals("") ? hd3.l(20, this.videoUrl) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.stickerId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        hd3Var.E(2, this.url);
                    }
                    int i = this.width;
                    if (i != 0) {
                        hd3Var.w(3, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        hd3Var.w(4, i2);
                    }
                    if (!this.mp4Url.equals("")) {
                        hd3Var.E(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        hd3Var.E(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i3 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i3];
                            if (str != null) {
                                hd3Var.E(8, str);
                            }
                            i3++;
                        }
                    }
                    if (!this.previewUrl.equals("")) {
                        hd3Var.E(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        hd3Var.x(10, j2);
                    }
                    int i4 = this.stickerType;
                    if (i4 != 0) {
                        hd3Var.w(13, i4);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        hd3Var.x(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        hd3Var.E(16, this.lottieUrl);
                    }
                    boolean z = this.audio;
                    if (z) {
                        hd3Var.r(17, z);
                    }
                    int i5 = this.authorType;
                    if (i5 != 0) {
                        hd3Var.w(18, i5);
                    }
                    if (this.videoUrl.equals("")) {
                        return;
                    }
                    hd3Var.E(20, this.videoUrl);
                }

                public static Sticker parseFrom(gd3 gd3Var) throws IOException {
                    return new Sticker().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Sticker mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                this.stickerId = gd3Var.q();
                                break;
                            case 18:
                                this.url = gd3Var.r();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                this.width = gd3Var.p();
                                break;
                            case 32:
                                this.height = gd3Var.p();
                                break;
                            case 42:
                                this.mp4Url = gd3Var.r();
                                break;
                            case 50:
                                this.firstUrl = gd3Var.r();
                                break;
                            case 66:
                                int iB = coi.b(gd3Var, 66);
                                String[] strArr = this.tags;
                                int length = strArr == null ? 0 : strArr.length;
                                int i = iB + length;
                                String[] strArr2 = new String[i];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    strArr2[length] = gd3Var.r();
                                    gd3Var.s();
                                    length++;
                                }
                                strArr2[length] = gd3Var.r();
                                this.tags = strArr2;
                                break;
                            case 74:
                                this.previewUrl = gd3Var.r();
                                break;
                            case 80:
                                this.updateTime = gd3Var.q();
                                break;
                            case 104:
                                int iP = gd3Var.p();
                                if (iP != 0 && iP != 1 && iP != 2 && iP != 3 && iP != 4) {
                                    break;
                                } else {
                                    this.stickerType = iP;
                                    break;
                                }
                            case 120:
                                this.setId = gd3Var.q();
                                break;
                            case 130:
                                this.lottieUrl = gd3Var.r();
                                break;
                            case 136:
                                this.audio = gd3Var.f();
                                break;
                            case 144:
                                int iP2 = gd3Var.p();
                                if (iP2 != 0 && iP2 != 1 && iP2 != 2) {
                                    break;
                                } else {
                                    this.authorType = iP2;
                                    break;
                                }
                                break;
                            case 162:
                                this.videoUrl = gd3Var.r();
                                break;
                            default:
                                if (!gd3Var.u(iS)) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return this;
                }
            }

            public static final class Video extends fl9 {
                private static volatile Video[] _emptyArray;
                public int audioGroupIndex;
                public int audioTrackIndex;
                public ConvertOptions convertOptions;
                public int duration;
                public String embedUrl;
                public String externalSiteName;
                public String externalUrl;
                public int height;
                public boolean ignoreAutoplay;
                public boolean isThumbnailInCache;
                public boolean live;
                public byte[] previewData;
                public long startTime;
                public String thumbnail;
                public String token;
                public VideoCollage videoCollage;
                public long videoId;
                public int videoType;
                public int width;

                public static final class ConvertOptions extends fl9 {
                    private static volatile ConvertOptions[] _emptyArray;
                    public float endTrimPosition;
                    public boolean mute;
                    public Quality quality;
                    public int qualityValue;
                    public float startTrimPosition;

                    public ConvertOptions() {
                        clear();
                    }

                    public static ConvertOptions[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (kp7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new ConvertOptions[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static ConvertOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (ConvertOptions) fl9.mergeFrom(new ConvertOptions(), bArr);
                    }

                    public ConvertOptions clear() {
                        this.quality = null;
                        this.startTrimPosition = 0.0f;
                        this.endTrimPosition = 0.0f;
                        this.qualityValue = 0;
                        this.mute = false;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.fl9
                    public int computeSerializedSize() {
                        Quality quality = this.quality;
                        int i = quality != null ? hd3.i(1, quality) : 0;
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i += hd3.e(2);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            i += hd3.e(3);
                        }
                        int i2 = this.qualityValue;
                        if (i2 != 0) {
                            i += hd3.f(4, i2);
                        }
                        return this.mute ? hd3.a(5) + i : i;
                    }

                    @Override // defpackage.fl9
                    public void writeTo(hd3 hd3Var) throws IOException {
                        Quality quality = this.quality;
                        if (quality != null) {
                            hd3Var.y(1, quality);
                        }
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(0.0f)) {
                            hd3Var.v(2, this.startTrimPosition);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(0.0f)) {
                            hd3Var.v(3, this.endTrimPosition);
                        }
                        int i = this.qualityValue;
                        if (i != 0) {
                            hd3Var.w(4, i);
                        }
                        boolean z = this.mute;
                        if (z) {
                            hd3Var.r(5, z);
                        }
                    }

                    public static ConvertOptions parseFrom(gd3 gd3Var) throws IOException {
                        return new ConvertOptions().mergeFrom(gd3Var);
                    }

                    @Override // defpackage.fl9
                    public ConvertOptions mergeFrom(gd3 gd3Var) throws IOException {
                        while (true) {
                            int iS = gd3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 10) {
                                if (this.quality == null) {
                                    this.quality = new Quality();
                                }
                                gd3Var.j(this.quality);
                            } else if (iS == 21) {
                                this.startTrimPosition = gd3Var.i();
                            } else if (iS == 29) {
                                this.endTrimPosition = gd3Var.i();
                            } else if (iS == 32) {
                                this.qualityValue = gd3Var.p();
                            } else if (iS == 40) {
                                this.mute = gd3Var.f();
                            } else if (!gd3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }
                }

                public static final class Quality extends fl9 {
                    private static volatile Quality[] _emptyArray;
                    public int bitrate;
                    public int height;
                    public boolean isOriginal;
                    public int ordinal;
                    public int width;

                    public Quality() {
                        clear();
                    }

                    public static Quality[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (kp7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Quality[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Quality) fl9.mergeFrom(new Quality(), bArr);
                    }

                    public Quality clear() {
                        this.ordinal = 0;
                        this.width = 0;
                        this.height = 0;
                        this.isOriginal = false;
                        this.bitrate = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.fl9
                    public int computeSerializedSize() {
                        int i = this.ordinal;
                        int iF = i != 0 ? hd3.f(1, i) : 0;
                        int i2 = this.width;
                        if (i2 != 0) {
                            iF += hd3.f(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            iF += hd3.f(3, i3);
                        }
                        if (this.isOriginal) {
                            iF += hd3.a(4);
                        }
                        int i4 = this.bitrate;
                        return i4 != 0 ? hd3.f(5, i4) + iF : iF;
                    }

                    @Override // defpackage.fl9
                    public void writeTo(hd3 hd3Var) throws IOException {
                        int i = this.ordinal;
                        if (i != 0) {
                            hd3Var.w(1, i);
                        }
                        int i2 = this.width;
                        if (i2 != 0) {
                            hd3Var.w(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            hd3Var.w(3, i3);
                        }
                        boolean z = this.isOriginal;
                        if (z) {
                            hd3Var.r(4, z);
                        }
                        int i4 = this.bitrate;
                        if (i4 != 0) {
                            hd3Var.w(5, i4);
                        }
                    }

                    public static Quality parseFrom(gd3 gd3Var) throws IOException {
                        return new Quality().mergeFrom(gd3Var);
                    }

                    @Override // defpackage.fl9
                    public Quality mergeFrom(gd3 gd3Var) throws IOException {
                        while (true) {
                            int iS = gd3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 8) {
                                this.ordinal = gd3Var.p();
                            } else if (iS == 16) {
                                this.width = gd3Var.p();
                            } else if (iS == 24) {
                                this.height = gd3Var.p();
                            } else if (iS == 32) {
                                this.isOriginal = gd3Var.f();
                            } else if (iS == 40) {
                                this.bitrate = gd3Var.p();
                            } else if (!gd3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }
                }

                public static final class VideoCollage extends fl9 {
                    private static volatile VideoCollage[] _emptyArray;
                    public int count;
                    public int frequency;
                    public int height;
                    public String url;
                    public int width;

                    public VideoCollage() {
                        clear();
                    }

                    public static VideoCollage[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (kp7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new VideoCollage[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static VideoCollage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (VideoCollage) fl9.mergeFrom(new VideoCollage(), bArr);
                    }

                    public VideoCollage clear() {
                        this.url = "";
                        this.frequency = 0;
                        this.height = 0;
                        this.width = 0;
                        this.count = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.fl9
                    public int computeSerializedSize() {
                        int iL = !this.url.equals("") ? hd3.l(1, this.url) : 0;
                        int i = this.frequency;
                        if (i != 0) {
                            iL += hd3.f(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            iL += hd3.f(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            iL += hd3.f(4, i3);
                        }
                        int i4 = this.count;
                        return i4 != 0 ? hd3.f(5, i4) + iL : iL;
                    }

                    @Override // defpackage.fl9
                    public void writeTo(hd3 hd3Var) throws IOException {
                        if (!this.url.equals("")) {
                            hd3Var.E(1, this.url);
                        }
                        int i = this.frequency;
                        if (i != 0) {
                            hd3Var.w(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            hd3Var.w(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            hd3Var.w(4, i3);
                        }
                        int i4 = this.count;
                        if (i4 != 0) {
                            hd3Var.w(5, i4);
                        }
                    }

                    public static VideoCollage parseFrom(gd3 gd3Var) throws IOException {
                        return new VideoCollage().mergeFrom(gd3Var);
                    }

                    @Override // defpackage.fl9
                    public VideoCollage mergeFrom(gd3 gd3Var) throws IOException {
                        while (true) {
                            int iS = gd3Var.s();
                            if (iS == 0) {
                                break;
                            }
                            if (iS == 10) {
                                this.url = gd3Var.r();
                            } else if (iS == 16) {
                                this.frequency = gd3Var.p();
                            } else if (iS == 24) {
                                this.height = gd3Var.p();
                            } else if (iS == 32) {
                                this.width = gd3Var.p();
                            } else if (iS == 40) {
                                this.count = gd3Var.p();
                            } else if (!gd3Var.u(iS)) {
                                break;
                            }
                        }
                        return this;
                    }
                }

                public Video() {
                    clear();
                }

                public static Video[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Video[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Video) fl9.mergeFrom(new Video(), bArr);
                }

                public Video clear() {
                    this.videoId = 0L;
                    this.duration = 0;
                    this.thumbnail = "";
                    this.width = 0;
                    this.height = 0;
                    this.live = false;
                    this.externalUrl = "";
                    this.previewData = coi.e;
                    this.isThumbnailInCache = false;
                    this.startTime = 0L;
                    this.externalSiteName = "";
                    this.convertOptions = null;
                    this.token = "";
                    this.videoCollage = null;
                    this.ignoreAutoplay = false;
                    this.audioTrackIndex = 0;
                    this.audioGroupIndex = 0;
                    this.videoType = 0;
                    this.embedUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    long j = this.videoId;
                    int iH = j != 0 ? hd3.h(1, j) : 0;
                    int i = this.duration;
                    if (i != 0) {
                        iH += hd3.f(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        iH += hd3.l(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        iH += hd3.f(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        iH += hd3.f(5, i3);
                    }
                    if (this.live) {
                        iH += hd3.a(6);
                    }
                    if (!this.externalUrl.equals("")) {
                        iH += hd3.l(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, coi.e)) {
                        iH += hd3.b(8, this.previewData);
                    }
                    if (this.isThumbnailInCache) {
                        iH += hd3.a(9);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        iH += hd3.h(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        iH += hd3.l(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions = this.convertOptions;
                    if (convertOptions != null) {
                        iH += hd3.i(12, convertOptions);
                    }
                    if (!this.token.equals("")) {
                        iH += hd3.l(13, this.token);
                    }
                    VideoCollage videoCollage = this.videoCollage;
                    if (videoCollage != null) {
                        iH += hd3.i(14, videoCollage);
                    }
                    if (this.ignoreAutoplay) {
                        iH += hd3.a(15);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        iH += hd3.f(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        iH += hd3.f(17, i5);
                    }
                    int i6 = this.videoType;
                    if (i6 != 0) {
                        iH += hd3.f(18, i6);
                    }
                    return !this.embedUrl.equals("") ? hd3.l(19, this.embedUrl) + iH : iH;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    long j = this.videoId;
                    if (j != 0) {
                        hd3Var.x(1, j);
                    }
                    int i = this.duration;
                    if (i != 0) {
                        hd3Var.w(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        hd3Var.E(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        hd3Var.w(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        hd3Var.w(5, i3);
                    }
                    boolean z = this.live;
                    if (z) {
                        hd3Var.r(6, z);
                    }
                    if (!this.externalUrl.equals("")) {
                        hd3Var.E(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, coi.e)) {
                        hd3Var.s(8, this.previewData);
                    }
                    boolean z2 = this.isThumbnailInCache;
                    if (z2) {
                        hd3Var.r(9, z2);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        hd3Var.x(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        hd3Var.E(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions = this.convertOptions;
                    if (convertOptions != null) {
                        hd3Var.y(12, convertOptions);
                    }
                    if (!this.token.equals("")) {
                        hd3Var.E(13, this.token);
                    }
                    VideoCollage videoCollage = this.videoCollage;
                    if (videoCollage != null) {
                        hd3Var.y(14, videoCollage);
                    }
                    boolean z3 = this.ignoreAutoplay;
                    if (z3) {
                        hd3Var.r(15, z3);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        hd3Var.w(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        hd3Var.w(17, i5);
                    }
                    int i6 = this.videoType;
                    if (i6 != 0) {
                        hd3Var.w(18, i6);
                    }
                    if (this.embedUrl.equals("")) {
                        return;
                    }
                    hd3Var.E(19, this.embedUrl);
                }

                public static Video parseFrom(gd3 gd3Var) throws IOException {
                    return new Video().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Video mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        switch (iS) {
                            case 0:
                                break;
                            case 8:
                                this.videoId = gd3Var.q();
                                break;
                            case 16:
                                this.duration = gd3Var.p();
                                break;
                            case 26:
                                this.thumbnail = gd3Var.r();
                                break;
                            case 32:
                                this.width = gd3Var.p();
                                break;
                            case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                                this.height = gd3Var.p();
                                break;
                            case 48:
                                this.live = gd3Var.f();
                                break;
                            case 58:
                                this.externalUrl = gd3Var.r();
                                break;
                            case 66:
                                this.previewData = gd3Var.g();
                                break;
                            case 72:
                                this.isThumbnailInCache = gd3Var.f();
                                break;
                            case 80:
                                this.startTime = gd3Var.q();
                                break;
                            case 90:
                                this.externalSiteName = gd3Var.r();
                                break;
                            case 98:
                                if (this.convertOptions == null) {
                                    this.convertOptions = new ConvertOptions();
                                }
                                gd3Var.j(this.convertOptions);
                                break;
                            case 106:
                                this.token = gd3Var.r();
                                break;
                            case 114:
                                if (this.videoCollage == null) {
                                    this.videoCollage = new VideoCollage();
                                }
                                gd3Var.j(this.videoCollage);
                                break;
                            case 120:
                                this.ignoreAutoplay = gd3Var.f();
                                break;
                            case 128:
                                this.audioTrackIndex = gd3Var.p();
                                break;
                            case 136:
                                this.audioGroupIndex = gd3Var.p();
                                break;
                            case 144:
                                this.videoType = gd3Var.p();
                                break;
                            case 154:
                                this.embedUrl = gd3Var.r();
                                break;
                            default:
                                if (!gd3Var.u(iS)) {
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    return this;
                }
            }

            public static final class Widget extends fl9 {
                private static volatile Widget[] _emptyArray;
                public Content[] contents;

                public static final class Content extends fl9 {
                    public static final int ADAPTIVE_ICON = 1;
                    public static final int DESCRIPTION = 5;
                    public static final int KEYBOARD = 6;
                    public static final int PICTURE = 2;
                    public static final int TITLE_BIG = 3;
                    public static final int TITLE_STANDARD = 4;
                    public static final int UNSUPPORTED = 0;
                    private static volatile Content[] _emptyArray;
                    public MessageElement[] elements;
                    public int iconHeight;
                    public String iconUrl;
                    public int iconWidth;
                    public InlineKeyboard keyboard;
                    public String text;
                    public int type;

                    public Content() {
                        clear();
                    }

                    public static Content[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (kp7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Content[0];
                                    }
                                } finally {
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Content parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Content) fl9.mergeFrom(new Content(), bArr);
                    }

                    public Content clear() {
                        this.type = 0;
                        this.keyboard = null;
                        this.text = "";
                        this.elements = MessageElement.emptyArray();
                        this.iconUrl = "";
                        this.iconWidth = 0;
                        this.iconHeight = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    @Override // defpackage.fl9
                    public int computeSerializedSize() {
                        int i = this.type;
                        int i2 = 0;
                        int iF = i != 0 ? hd3.f(1, i) : 0;
                        InlineKeyboard inlineKeyboard = this.keyboard;
                        if (inlineKeyboard != null) {
                            iF += hd3.i(2, inlineKeyboard);
                        }
                        if (!this.text.equals("")) {
                            iF += hd3.l(3, this.text);
                        }
                        MessageElement[] messageElementArr = this.elements;
                        if (messageElementArr != null && messageElementArr.length > 0) {
                            while (true) {
                                MessageElement[] messageElementArr2 = this.elements;
                                if (i2 >= messageElementArr2.length) {
                                    break;
                                }
                                MessageElement messageElement = messageElementArr2[i2];
                                if (messageElement != null) {
                                    iF = hd3.i(4, messageElement) + iF;
                                }
                                i2++;
                            }
                        }
                        if (!this.iconUrl.equals("")) {
                            iF += hd3.l(5, this.iconUrl);
                        }
                        int i3 = this.iconWidth;
                        if (i3 != 0) {
                            iF += hd3.f(6, i3);
                        }
                        int i4 = this.iconHeight;
                        return i4 != 0 ? hd3.f(7, i4) + iF : iF;
                    }

                    @Override // defpackage.fl9
                    public void writeTo(hd3 hd3Var) throws IOException {
                        int i = this.type;
                        if (i != 0) {
                            hd3Var.w(1, i);
                        }
                        InlineKeyboard inlineKeyboard = this.keyboard;
                        if (inlineKeyboard != null) {
                            hd3Var.y(2, inlineKeyboard);
                        }
                        if (!this.text.equals("")) {
                            hd3Var.E(3, this.text);
                        }
                        MessageElement[] messageElementArr = this.elements;
                        if (messageElementArr != null && messageElementArr.length > 0) {
                            int i2 = 0;
                            while (true) {
                                MessageElement[] messageElementArr2 = this.elements;
                                if (i2 >= messageElementArr2.length) {
                                    break;
                                }
                                MessageElement messageElement = messageElementArr2[i2];
                                if (messageElement != null) {
                                    hd3Var.y(4, messageElement);
                                }
                                i2++;
                            }
                        }
                        if (!this.iconUrl.equals("")) {
                            hd3Var.E(5, this.iconUrl);
                        }
                        int i3 = this.iconWidth;
                        if (i3 != 0) {
                            hd3Var.w(6, i3);
                        }
                        int i4 = this.iconHeight;
                        if (i4 != 0) {
                            hd3Var.w(7, i4);
                        }
                    }

                    public static Content parseFrom(gd3 gd3Var) throws IOException {
                        return new Content().mergeFrom(gd3Var);
                    }

                    @Override // defpackage.fl9
                    public Content mergeFrom(gd3 gd3Var) throws IOException {
                        while (true) {
                            int iS = gd3Var.s();
                            if (iS != 0) {
                                if (iS == 8) {
                                    int iP = gd3Var.p();
                                    switch (iP) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            this.type = iP;
                                            break;
                                    }
                                } else if (iS == 18) {
                                    if (this.keyboard == null) {
                                        this.keyboard = new InlineKeyboard();
                                    }
                                    gd3Var.j(this.keyboard);
                                } else if (iS == 26) {
                                    this.text = gd3Var.r();
                                } else if (iS == 34) {
                                    int iB = coi.b(gd3Var, 34);
                                    MessageElement[] messageElementArr = this.elements;
                                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                                    int i = iB + length;
                                    MessageElement[] messageElementArr2 = new MessageElement[i];
                                    if (length != 0) {
                                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                                    }
                                    while (length < i - 1) {
                                        MessageElement messageElement = new MessageElement();
                                        messageElementArr2[length] = messageElement;
                                        gd3Var.j(messageElement);
                                        gd3Var.s();
                                        length++;
                                    }
                                    MessageElement messageElement2 = new MessageElement();
                                    messageElementArr2[length] = messageElement2;
                                    gd3Var.j(messageElement2);
                                    this.elements = messageElementArr2;
                                } else if (iS == 42) {
                                    this.iconUrl = gd3Var.r();
                                } else if (iS == 48) {
                                    this.iconWidth = gd3Var.p();
                                } else if (iS == 56) {
                                    this.iconHeight = gd3Var.p();
                                } else if (!gd3Var.u(iS)) {
                                }
                            }
                        }
                        return this;
                    }
                }

                public Widget() {
                    clear();
                }

                public static Widget[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Widget[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Widget parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Widget) fl9.mergeFrom(new Widget(), bArr);
                }

                public Widget clear() {
                    this.contents = Content.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    Content[] contentArr = this.contents;
                    int i = 0;
                    if (contentArr == null || contentArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Content[] contentArr2 = this.contents;
                        if (i >= contentArr2.length) {
                            return i2;
                        }
                        Content content = contentArr2[i];
                        if (content != null) {
                            i2 = hd3.i(1, content) + i2;
                        }
                        i++;
                    }
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    Content[] contentArr = this.contents;
                    if (contentArr == null || contentArr.length <= 0) {
                        return;
                    }
                    int i = 0;
                    while (true) {
                        Content[] contentArr2 = this.contents;
                        if (i >= contentArr2.length) {
                            return;
                        }
                        Content content = contentArr2[i];
                        if (content != null) {
                            hd3Var.y(1, content);
                        }
                        i++;
                    }
                }

                public static Widget parseFrom(gd3 gd3Var) throws IOException {
                    return new Widget().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public Widget mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 10) {
                            int iB = coi.b(gd3Var, 10);
                            Content[] contentArr = this.contents;
                            int length = contentArr == null ? 0 : contentArr.length;
                            int i = iB + length;
                            Content[] contentArr2 = new Content[i];
                            if (length != 0) {
                                System.arraycopy(contentArr, 0, contentArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Content content = new Content();
                                contentArr2[length] = content;
                                gd3Var.j(content);
                                gd3Var.s();
                                length++;
                            }
                            Content content2 = new Content();
                            contentArr2[length] = content2;
                            gd3Var.j(content2);
                            this.contents = contentArr2;
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public Attach() {
                clear();
            }

            public static Attach[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Attach[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Attach parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Attach) fl9.mergeFrom(new Attach(), bArr);
            }

            public Attach clear() {
                this.type = 0;
                this.photo = null;
                this.control = null;
                this.video = null;
                this.audio = null;
                this.sticker = null;
                this.share = null;
                this.app = null;
                this.call = null;
                this.status = 0;
                this.lastErrorTime = 0L;
                this.progress = 0;
                this.localId = "";
                this.localPath = "";
                this.isProcessingOnServer = false;
                this.isDeleted = false;
                this.totalBytes = 0L;
                this.bytesDownloaded = 0L;
                this.file = null;
                this.contact = null;
                this.lastModified = 0L;
                this.present = null;
                this.inlineKeyboard = null;
                this.location = null;
                this.progressFloat = 0.0f;
                this.processingOnServerStatus = 0;
                this.sensitiveContentUnlocked = false;
                this.sensitive = false;
                this.widget = null;
                this.appVersion = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int i = this.type;
                int iF = i != 0 ? hd3.f(1, i) : 0;
                Photo photo = this.photo;
                if (photo != null) {
                    iF += hd3.i(2, photo);
                }
                Control control = this.control;
                if (control != null) {
                    iF += hd3.i(3, control);
                }
                Video video = this.video;
                if (video != null) {
                    iF += hd3.i(4, video);
                }
                Audio audio = this.audio;
                if (audio != null) {
                    iF += hd3.i(5, audio);
                }
                Sticker sticker = this.sticker;
                if (sticker != null) {
                    iF += hd3.i(6, sticker);
                }
                Share share = this.share;
                if (share != null) {
                    iF += hd3.i(7, share);
                }
                App app = this.app;
                if (app != null) {
                    iF += hd3.i(8, app);
                }
                Call call = this.call;
                if (call != null) {
                    iF += hd3.i(9, call);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    iF += hd3.f(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    iF += hd3.h(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    iF += hd3.f(12, i3);
                }
                if (!this.localId.equals("")) {
                    iF += hd3.l(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    iF += hd3.l(14, this.localPath);
                }
                if (this.isProcessingOnServer) {
                    iF += hd3.a(15);
                }
                if (this.isDeleted) {
                    iF += hd3.a(16);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    iF += hd3.h(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    iF += hd3.h(18, j3);
                }
                File file = this.file;
                if (file != null) {
                    iF += hd3.i(20, file);
                }
                Contact contact = this.contact;
                if (contact != null) {
                    iF += hd3.i(21, contact);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    iF += hd3.h(22, j4);
                }
                Present present = this.present;
                if (present != null) {
                    iF += hd3.i(23, present);
                }
                InlineKeyboard inlineKeyboard = this.inlineKeyboard;
                if (inlineKeyboard != null) {
                    iF += hd3.i(24, inlineKeyboard);
                }
                Location location = this.location;
                if (location != null) {
                    iF += hd3.i(25, location);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    iF += hd3.e(26);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    iF += hd3.f(27, i4);
                }
                if (this.sensitiveContentUnlocked) {
                    iF += hd3.a(28);
                }
                if (this.sensitive) {
                    iF += hd3.a(29);
                }
                Widget widget = this.widget;
                if (widget != null) {
                    iF += hd3.i(31, widget);
                }
                return !this.appVersion.equals("") ? hd3.l(32, this.appVersion) + iF : iF;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                int i = this.type;
                if (i != 0) {
                    hd3Var.w(1, i);
                }
                Photo photo = this.photo;
                if (photo != null) {
                    hd3Var.y(2, photo);
                }
                Control control = this.control;
                if (control != null) {
                    hd3Var.y(3, control);
                }
                Video video = this.video;
                if (video != null) {
                    hd3Var.y(4, video);
                }
                Audio audio = this.audio;
                if (audio != null) {
                    hd3Var.y(5, audio);
                }
                Sticker sticker = this.sticker;
                if (sticker != null) {
                    hd3Var.y(6, sticker);
                }
                Share share = this.share;
                if (share != null) {
                    hd3Var.y(7, share);
                }
                App app = this.app;
                if (app != null) {
                    hd3Var.y(8, app);
                }
                Call call = this.call;
                if (call != null) {
                    hd3Var.y(9, call);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    hd3Var.w(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    hd3Var.x(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    hd3Var.w(12, i3);
                }
                if (!this.localId.equals("")) {
                    hd3Var.E(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    hd3Var.E(14, this.localPath);
                }
                boolean z = this.isProcessingOnServer;
                if (z) {
                    hd3Var.r(15, z);
                }
                boolean z2 = this.isDeleted;
                if (z2) {
                    hd3Var.r(16, z2);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    hd3Var.x(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    hd3Var.x(18, j3);
                }
                File file = this.file;
                if (file != null) {
                    hd3Var.y(20, file);
                }
                Contact contact = this.contact;
                if (contact != null) {
                    hd3Var.y(21, contact);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    hd3Var.x(22, j4);
                }
                Present present = this.present;
                if (present != null) {
                    hd3Var.y(23, present);
                }
                InlineKeyboard inlineKeyboard = this.inlineKeyboard;
                if (inlineKeyboard != null) {
                    hd3Var.y(24, inlineKeyboard);
                }
                Location location = this.location;
                if (location != null) {
                    hd3Var.y(25, location);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(0.0f)) {
                    hd3Var.v(26, this.progressFloat);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    hd3Var.w(27, i4);
                }
                boolean z3 = this.sensitiveContentUnlocked;
                if (z3) {
                    hd3Var.r(28, z3);
                }
                boolean z4 = this.sensitive;
                if (z4) {
                    hd3Var.r(29, z4);
                }
                Widget widget = this.widget;
                if (widget != null) {
                    hd3Var.y(31, widget);
                }
                if (this.appVersion.equals("")) {
                    return;
                }
                hd3Var.E(32, this.appVersion);
            }

            public static Attach parseFrom(gd3 gd3Var) throws IOException {
                return new Attach().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public Attach mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            int iP = gd3Var.p();
                            switch (iP) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case PRESENT /* 12 */:
                                case 13:
                                case LOCATION /* 14 */:
                                case DAILY_MEDIA /* 15 */:
                                case 16:
                                    this.type = iP;
                                    break;
                            }
                        case 18:
                            if (this.photo == null) {
                                this.photo = new Photo();
                            }
                            gd3Var.j(this.photo);
                            break;
                        case 26:
                            if (this.control == null) {
                                this.control = new Control();
                            }
                            gd3Var.j(this.control);
                            break;
                        case 34:
                            if (this.video == null) {
                                this.video = new Video();
                            }
                            gd3Var.j(this.video);
                            break;
                        case 42:
                            if (this.audio == null) {
                                this.audio = new Audio();
                            }
                            gd3Var.j(this.audio);
                            break;
                        case 50:
                            if (this.sticker == null) {
                                this.sticker = new Sticker();
                            }
                            gd3Var.j(this.sticker);
                            break;
                        case 58:
                            if (this.share == null) {
                                this.share = new Share();
                            }
                            gd3Var.j(this.share);
                            break;
                        case 66:
                            if (this.app == null) {
                                this.app = new App();
                            }
                            gd3Var.j(this.app);
                            break;
                        case 74:
                            if (this.call == null) {
                                this.call = new Call();
                            }
                            gd3Var.j(this.call);
                            break;
                        case 80:
                            int iP2 = gd3Var.p();
                            if (iP2 != 0 && iP2 != 1 && iP2 != 2 && iP2 != 3 && iP2 != 4) {
                                break;
                            } else {
                                this.status = iP2;
                                break;
                            }
                        case 88:
                            this.lastErrorTime = gd3Var.q();
                            break;
                        case 96:
                            this.progress = gd3Var.p();
                            break;
                        case 106:
                            this.localId = gd3Var.r();
                            break;
                        case 114:
                            this.localPath = gd3Var.r();
                            break;
                        case 120:
                            this.isProcessingOnServer = gd3Var.f();
                            break;
                        case 128:
                            this.isDeleted = gd3Var.f();
                            break;
                        case 136:
                            this.totalBytes = gd3Var.q();
                            break;
                        case 144:
                            this.bytesDownloaded = gd3Var.q();
                            break;
                        case 162:
                            if (this.file == null) {
                                this.file = new File();
                            }
                            gd3Var.j(this.file);
                            break;
                        case 170:
                            if (this.contact == null) {
                                this.contact = new Contact();
                            }
                            gd3Var.j(this.contact);
                            break;
                        case 176:
                            this.lastModified = gd3Var.q();
                            break;
                        case 186:
                            if (this.present == null) {
                                this.present = new Present();
                            }
                            gd3Var.j(this.present);
                            break;
                        case 194:
                            if (this.inlineKeyboard == null) {
                                this.inlineKeyboard = new InlineKeyboard();
                            }
                            gd3Var.j(this.inlineKeyboard);
                            break;
                        case HttpStatus.SC_ACCEPTED /* 202 */:
                            if (this.location == null) {
                                this.location = new Location();
                            }
                            gd3Var.j(this.location);
                            break;
                        case 213:
                            this.progressFloat = gd3Var.i();
                            break;
                        case 216:
                            int iP3 = gd3Var.p();
                            if (iP3 != 0 && iP3 != 1 && iP3 != 2) {
                                break;
                            } else {
                                this.processingOnServerStatus = iP3;
                                break;
                            }
                        case 224:
                            this.sensitiveContentUnlocked = gd3Var.f();
                            break;
                        case 232:
                            this.sensitive = gd3Var.f();
                            break;
                        case 250:
                            if (this.widget == null) {
                                this.widget = new Widget();
                            }
                            gd3Var.j(this.widget);
                            break;
                        case 258:
                            this.appVersion = gd3Var.r();
                            break;
                        default:
                            if (!gd3Var.u(iS)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }
        }

        public static final class LocationInfo extends fl9 {
            private static volatile LocationInfo[] _emptyArray;
            public float accuracy;
            public double altitude;
            public float bearing;
            public double latitude;
            public double longitude;
            public float speed;
            public long time;

            public LocationInfo() {
                clear();
            }

            public static LocationInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LocationInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static LocationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LocationInfo) fl9.mergeFrom(new LocationInfo(), bArr);
            }

            public LocationInfo clear() {
                this.latitude = 0.0d;
                this.longitude = 0.0d;
                this.time = 0L;
                this.altitude = 0.0d;
                this.accuracy = 0.0f;
                this.bearing = 0.0f;
                this.speed = 0.0f;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int iC = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? hd3.c(1) : 0;
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    iC += hd3.c(2);
                }
                long j = this.time;
                if (j != 0) {
                    iC += hd3.h(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    iC += hd3.c(4);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    iC += hd3.e(5);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    iC += hd3.e(6);
                }
                return Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f) ? hd3.e(7) + iC : iC;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                    hd3Var.t(1, this.latitude);
                }
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    hd3Var.t(2, this.longitude);
                }
                long j = this.time;
                if (j != 0) {
                    hd3Var.x(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    hd3Var.t(4, this.altitude);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(0.0f)) {
                    hd3Var.v(5, this.accuracy);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(0.0f)) {
                    hd3Var.v(6, this.bearing);
                }
                if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(0.0f)) {
                    hd3Var.v(7, this.speed);
                }
            }

            public static LocationInfo parseFrom(gd3 gd3Var) throws IOException {
                return new LocationInfo().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public LocationInfo mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 9) {
                        this.latitude = gd3Var.h();
                    } else if (iS == 17) {
                        this.longitude = gd3Var.h();
                    } else if (iS == 24) {
                        this.time = gd3Var.q();
                    } else if (iS == 33) {
                        this.altitude = gd3Var.h();
                    } else if (iS == 45) {
                        this.accuracy = gd3Var.i();
                    } else if (iS == 53) {
                        this.bearing = gd3Var.i();
                    } else if (iS == 61) {
                        this.speed = gd3Var.i();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public Attaches() {
            clear();
        }

        public static Attaches[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Attaches[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Attaches parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Attaches) fl9.mergeFrom(new Attaches(), bArr);
        }

        public Attaches clear() {
            this.attach = Attach.emptyArray();
            this.keyboard = null;
            this.sendAction = null;
            this.replyKeyboard = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            Attach[] attachArr = this.attach;
            int i = 0;
            if (attachArr != null && attachArr.length > 0) {
                int i2 = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach = attachArr2[i];
                    if (attach != null) {
                        i2 = hd3.i(1, attach) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                i += hd3.i(2, inlineKeyboard);
            }
            Attach.SendAction sendAction = this.sendAction;
            if (sendAction != null) {
                i += hd3.i(3, sendAction);
            }
            Attach.ReplyKeyboard replyKeyboard = this.replyKeyboard;
            return replyKeyboard != null ? hd3.i(4, replyKeyboard) + i : i;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            Attach[] attachArr = this.attach;
            if (attachArr != null && attachArr.length > 0) {
                int i = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach = attachArr2[i];
                    if (attach != null) {
                        hd3Var.y(1, attach);
                    }
                    i++;
                }
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                hd3Var.y(2, inlineKeyboard);
            }
            Attach.SendAction sendAction = this.sendAction;
            if (sendAction != null) {
                hd3Var.y(3, sendAction);
            }
            Attach.ReplyKeyboard replyKeyboard = this.replyKeyboard;
            if (replyKeyboard != null) {
                hd3Var.y(4, replyKeyboard);
            }
        }

        public static Attaches parseFrom(gd3 gd3Var) throws IOException {
            return new Attaches().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public Attaches mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    int iB = coi.b(gd3Var, 10);
                    Attach[] attachArr = this.attach;
                    int length = attachArr == null ? 0 : attachArr.length;
                    int i = iB + length;
                    Attach[] attachArr2 = new Attach[i];
                    if (length != 0) {
                        System.arraycopy(attachArr, 0, attachArr2, 0, length);
                    }
                    while (length < i - 1) {
                        Attach attach = new Attach();
                        attachArr2[length] = attach;
                        gd3Var.j(attach);
                        gd3Var.s();
                        length++;
                    }
                    Attach attach2 = new Attach();
                    attachArr2[length] = attach2;
                    gd3Var.j(attach2);
                    this.attach = attachArr2;
                } else if (iS == 18) {
                    if (this.keyboard == null) {
                        this.keyboard = new Attach.InlineKeyboard();
                    }
                    gd3Var.j(this.keyboard);
                } else if (iS == 26) {
                    if (this.sendAction == null) {
                        this.sendAction = new Attach.SendAction();
                    }
                    gd3Var.j(this.sendAction);
                } else if (iS == 34) {
                    if (this.replyKeyboard == null) {
                        this.replyKeyboard = new Attach.ReplyKeyboard();
                    }
                    gd3Var.j(this.replyKeyboard);
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class CallHistoryState extends fl9 {
        private static volatile CallHistoryState[] _emptyArray;
        public long backwardMarker;
        public Chat.Chunk chunk;
        public long forwardMarker;
        public boolean hasNext;
        public boolean hasPrev;
        public Map<Long, MissedMessagesItem> missedMessagesIds;

        public static final class MissedMessagesItem extends fl9 {
            private static volatile MissedMessagesItem[] _emptyArray;
            public long[] ids;

            public MissedMessagesItem() {
                clear();
            }

            public static MissedMessagesItem[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MissedMessagesItem[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static MissedMessagesItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MissedMessagesItem) fl9.mergeFrom(new MissedMessagesItem(), bArr);
            }

            public MissedMessagesItem clear() {
                this.ids = coi.b;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long[] jArr = this.ids;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += hd3.k(jArr2[i]);
                    i++;
                }
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long[] jArr = this.ids;
                if (jArr == null || jArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return;
                    }
                    hd3Var.x(1, jArr2[i]);
                    i++;
                }
            }

            public static MissedMessagesItem parseFrom(gd3 gd3Var) throws IOException {
                return new MissedMessagesItem().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public MissedMessagesItem mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        int iB = coi.b(gd3Var, 8);
                        long[] jArr = this.ids;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.ids = jArr2;
                    } else if (iS == 10) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.ids;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.ids = jArr4;
                        gd3Var.d(iE);
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public CallHistoryState() {
            clear();
        }

        public static CallHistoryState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CallHistoryState[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static CallHistoryState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CallHistoryState) fl9.mergeFrom(new CallHistoryState(), bArr);
        }

        public CallHistoryState clear() {
            this.chunk = null;
            this.forwardMarker = 0L;
            this.backwardMarker = 0L;
            this.hasNext = false;
            this.hasPrev = false;
            this.missedMessagesIds = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            Chat.Chunk chunk = this.chunk;
            int i = chunk != null ? hd3.i(1, chunk) : 0;
            long j = this.forwardMarker;
            if (j != 0) {
                i += hd3.h(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                i += hd3.h(3, j2);
            }
            if (this.hasNext) {
                i += hd3.a(4);
            }
            if (this.hasPrev) {
                i += hd3.a(5);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            return map != null ? kp7.a(map, 6, 3, 11) + i : i;
        }

        @Override // defpackage.fl9
        public CallHistoryState mergeFrom(gd3 gd3Var) throws IOException {
            gd3 gd3Var2;
            tn8 tn8Var = jei.a;
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    gd3Var2 = gd3Var;
                    if (this.chunk == null) {
                        this.chunk = new Chat.Chunk();
                    }
                    gd3Var2.j(this.chunk);
                } else if (iS == 16) {
                    gd3Var2 = gd3Var;
                    this.forwardMarker = gd3Var2.q();
                } else if (iS == 24) {
                    gd3Var2 = gd3Var;
                    this.backwardMarker = gd3Var2.q();
                } else if (iS == 32) {
                    gd3Var2 = gd3Var;
                    this.hasNext = gd3Var2.f();
                } else if (iS == 40) {
                    gd3Var2 = gd3Var;
                    this.hasPrev = gd3Var2.f();
                } else if (iS == 50) {
                    gd3Var2 = gd3Var;
                    this.missedMessagesIds = kp7.b(gd3Var2, this.missedMessagesIds, tn8Var, 3, 11, new MissedMessagesItem(), 8, 18);
                } else {
                    if (!gd3Var.u(iS)) {
                        break;
                    }
                    gd3Var2 = gd3Var;
                }
                gd3Var = gd3Var2;
            }
            return this;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            Chat.Chunk chunk = this.chunk;
            if (chunk != null) {
                hd3Var.y(1, chunk);
            }
            long j = this.forwardMarker;
            if (j != 0) {
                hd3Var.x(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                hd3Var.x(3, j2);
            }
            boolean z = this.hasNext;
            if (z) {
                hd3Var.r(4, z);
            }
            boolean z2 = this.hasPrev;
            if (z2) {
                hd3Var.r(5, z2);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            if (map != null) {
                kp7.d(hd3Var, map, 6, 3, 11);
            }
        }

        public static CallHistoryState parseFrom(gd3 gd3Var) throws IOException {
            return new CallHistoryState().mergeFrom(gd3Var);
        }
    }

    public static final class Chat extends fl9 {
        public static final int ACTIVE = 0;
        public static final int CHANGE_PARTICIPANT = 2;
        public static final int CHANNEL = 2;
        public static final int CHAT = 1;
        public static final int CLOSED = 5;
        public static final int DIALOG = 0;
        public static final int GROUP_CHAT = 3;
        public static final int HIDDEN = 6;
        public static final int ICON = 1;
        public static final int LEAVING = 2;
        public static final int LED = 2;
        public static final int LEFT = 1;
        public static final int PIN_MESSAGE = 3;
        public static final int PRIVATE = 1;
        public static final int PUBLIC = 0;
        public static final int REMOVED = 3;
        public static final int REMOVING = 4;
        public static final int SOUND = 0;
        public static final int TITLE = 0;
        public static final int VIBRATION = 1;
        private static volatile Chat[] _emptyArray;
        public int accessType;
        public Map<Long, AdminParticipant> adminParticipants;
        public long[] admins;
        public String baseIconUrl;
        public String baseRawIconUrl;
        public int blockedParticipantsCount;
        public BotsInfo botsInfo;
        public ChannelInfo channelInfo;
        public long[] chatFoldersIds;
        public ChatOptions chatOptions;
        public ChatSettings chatSettings;
        public ChatSubject chatSubject;
        public Chunk[] chunk;
        public long cid;
        public long created;
        public Chunk[] delayedChunk;
        public String description;
        public byte[] draft;
        public long draftUpdateTime;
        public long draftUpdateTimeForSyncLogic;
        public long firstMessageId;
        public int flagsSettings;
        public GroupChatInfo groupChatInfo;
        public boolean hidePinnedMessage;
        public long joinTime;
        public long lastDelayedUpdateTime;
        public long lastEventTime;
        public long lastFireDelayedErrorTime;
        public long lastMentionMessageId;
        public long lastMessageId;
        public long lastOpenNewMessages;
        public int lastOpenPositionOffset;
        public long lastOpenPositionTime;
        public long lastOpenReadMark;
        public PushMessage lastPushMessage;
        public long lastReactedMessageId;
        public String lastReaction;
        public long lastSearchClickTime;
        public long lastWriteTime;
        public String link;
        public Map<Long, Long> liveLocationMessageIds;
        public int[] localChanges;
        public boolean markedAsUnread;
        public ChatMedia mediaAll;
        public ChatMedia mediaAudio;
        public ChatMedia mediaAudioVideoMsg;
        public ChatMedia mediaFiles;
        public ChatMedia mediaLocations;
        public ChatMedia mediaMusic;
        public ChatMedia mediaPhotoVideo;
        public ChatMedia mediaShare;
        public int messagesTtlSec;
        public long modified;
        public int newMessages;
        public long owner;
        public Map<Long, Long> participants;
        public int participantsCount;
        public long pinnedMessageId;
        public int restrictions;
        public Section[] sections;
        public long serverId;
        public int status;
        public String[] stickersOrder;
        public long stickersSyncTime;
        public boolean subscribedToUpdates;
        public String title;
        public int type;
        public long unbindOkPanelCloseTime;
        public boolean unreadPin;
        public boolean unreadReply;
        public VideoConversation videoConversation;

        public static final class AdminParticipant extends fl9 {
            private static volatile AdminParticipant[] _emptyArray;
            public String alias;
            public long id;
            public long inviterId;
            public int permissions;

            public AdminParticipant() {
                clear();
            }

            public static AdminParticipant[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new AdminParticipant[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static AdminParticipant parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (AdminParticipant) fl9.mergeFrom(new AdminParticipant(), bArr);
            }

            public AdminParticipant clear() {
                this.id = 0L;
                this.permissions = 0;
                this.inviterId = 0L;
                this.alias = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long j = this.id;
                int iH = j != 0 ? hd3.h(1, j) : 0;
                int i = this.permissions;
                if (i != 0) {
                    iH += hd3.f(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    iH += hd3.h(3, j2);
                }
                return !this.alias.equals("") ? hd3.l(4, this.alias) + iH : iH;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long j = this.id;
                if (j != 0) {
                    hd3Var.x(1, j);
                }
                int i = this.permissions;
                if (i != 0) {
                    hd3Var.w(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    hd3Var.x(3, j2);
                }
                if (this.alias.equals("")) {
                    return;
                }
                hd3Var.E(4, this.alias);
            }

            public static AdminParticipant parseFrom(gd3 gd3Var) throws IOException {
                return new AdminParticipant().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public AdminParticipant mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.id = gd3Var.q();
                    } else if (iS == 16) {
                        this.permissions = gd3Var.p();
                    } else if (iS == 24) {
                        this.inviterId = gd3Var.q();
                    } else if (iS == 34) {
                        this.alias = gd3Var.r();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class BotsInfo extends fl9 {
            private static volatile BotsInfo[] _emptyArray;
            public boolean hasBots;
            public boolean suspendedBot;

            public BotsInfo() {
                clear();
            }

            public static BotsInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new BotsInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static BotsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (BotsInfo) fl9.mergeFrom(new BotsInfo(), bArr);
            }

            public BotsInfo clear() {
                this.hasBots = false;
                this.suspendedBot = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int iA = this.hasBots ? hd3.a(1) : 0;
                return this.suspendedBot ? hd3.a(2) + iA : iA;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                boolean z = this.hasBots;
                if (z) {
                    hd3Var.r(1, z);
                }
                boolean z2 = this.suspendedBot;
                if (z2) {
                    hd3Var.r(2, z2);
                }
            }

            public static BotsInfo parseFrom(gd3 gd3Var) throws IOException {
                return new BotsInfo().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public BotsInfo mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.hasBots = gd3Var.f();
                    } else if (iS == 16) {
                        this.suspendedBot = gd3Var.f();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class ChannelInfo extends fl9 {
            private static volatile ChannelInfo[] _emptyArray;
            public long[] admins;
            public String description;
            public int membersCount;
            public boolean signAdmin;

            public ChannelInfo() {
                clear();
            }

            public static ChannelInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChannelInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChannelInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChannelInfo) fl9.mergeFrom(new ChannelInfo(), bArr);
            }

            public ChannelInfo clear() {
                this.membersCount = 0;
                this.description = "";
                this.admins = coi.b;
                this.signAdmin = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long[] jArr;
                int i = this.membersCount;
                int i2 = 0;
                int iF = i != 0 ? hd3.f(1, i) : 0;
                if (!this.description.equals("")) {
                    iF += hd3.l(2, this.description);
                }
                long[] jArr2 = this.admins;
                if (jArr2 != null && jArr2.length > 0) {
                    int iK = 0;
                    while (true) {
                        jArr = this.admins;
                        if (i2 >= jArr.length) {
                            break;
                        }
                        iK += hd3.k(jArr[i2]);
                        i2++;
                    }
                    iF = iF + iK + jArr.length;
                }
                return this.signAdmin ? hd3.a(4) + iF : iF;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                int i = this.membersCount;
                if (i != 0) {
                    hd3Var.w(1, i);
                }
                if (!this.description.equals("")) {
                    hd3Var.E(2, this.description);
                }
                long[] jArr = this.admins;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.admins;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        hd3Var.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                boolean z = this.signAdmin;
                if (z) {
                    hd3Var.r(4, z);
                }
            }

            public static ChannelInfo parseFrom(gd3 gd3Var) throws IOException {
                return new ChannelInfo().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ChannelInfo mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.membersCount = gd3Var.p();
                    } else if (iS == 18) {
                        this.description = gd3Var.r();
                    } else if (iS == 24) {
                        int iB = coi.b(gd3Var, 24);
                        long[] jArr = this.admins;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.admins = jArr2;
                    } else if (iS == 26) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.admins;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.admins = jArr4;
                        gd3Var.d(iE);
                    } else if (iS == 32) {
                        this.signAdmin = gd3Var.f();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class ChatMedia extends fl9 {
            private static volatile ChatMedia[] _emptyArray;
            public Chunk chunk;
            public Chunk[] chunks;
            public long firstMessageId;
            public long lastMessageId;
            public int totalCount;

            public ChatMedia() {
                clear();
            }

            public static ChatMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatMedia[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatMedia) fl9.mergeFrom(new ChatMedia(), bArr);
            }

            public ChatMedia clear() {
                this.chunk = null;
                this.totalCount = 0;
                this.firstMessageId = 0L;
                this.lastMessageId = 0L;
                this.chunks = Chunk.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                Chunk chunk = this.chunk;
                int i = 0;
                int i2 = chunk != null ? hd3.i(1, chunk) : 0;
                int i3 = this.totalCount;
                if (i3 != 0) {
                    i2 += hd3.f(2, i3);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    i2 += hd3.h(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    i2 += hd3.h(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    while (true) {
                        Chunk[] chunkArr2 = this.chunks;
                        if (i >= chunkArr2.length) {
                            break;
                        }
                        Chunk chunk2 = chunkArr2[i];
                        if (chunk2 != null) {
                            i2 = hd3.i(5, chunk2) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                Chunk chunk = this.chunk;
                if (chunk != null) {
                    hd3Var.y(1, chunk);
                }
                int i = this.totalCount;
                if (i != 0) {
                    hd3Var.w(2, i);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    hd3Var.x(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    hd3Var.x(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr == null || chunkArr.length <= 0) {
                    return;
                }
                int i2 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunks;
                    if (i2 >= chunkArr2.length) {
                        return;
                    }
                    Chunk chunk2 = chunkArr2[i2];
                    if (chunk2 != null) {
                        hd3Var.y(5, chunk2);
                    }
                    i2++;
                }
            }

            public static ChatMedia parseFrom(gd3 gd3Var) throws IOException {
                return new ChatMedia().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ChatMedia mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        if (this.chunk == null) {
                            this.chunk = new Chunk();
                        }
                        gd3Var.j(this.chunk);
                    } else if (iS == 16) {
                        this.totalCount = gd3Var.p();
                    } else if (iS == 24) {
                        this.firstMessageId = gd3Var.q();
                    } else if (iS == 32) {
                        this.lastMessageId = gd3Var.q();
                    } else if (iS == 42) {
                        int iB = coi.b(gd3Var, 42);
                        Chunk[] chunkArr = this.chunks;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = iB + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk = new Chunk();
                            chunkArr2[length] = chunk;
                            gd3Var.j(chunk);
                            gd3Var.s();
                            length++;
                        }
                        Chunk chunk2 = new Chunk();
                        chunkArr2[length] = chunk2;
                        gd3Var.j(chunk2);
                        this.chunks = chunkArr2;
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class ChatOptions extends fl9 {
            private static volatile ChatOptions[] _emptyArray;
            public boolean aPlusChannel;
            public boolean allCanPinMessage;
            public boolean contentLevelChat;
            public boolean membersCanSeePrivateLink;
            public boolean official;
            public boolean onlyAdminCanAddMember;
            public boolean onlyAdminCanCall;
            public boolean onlyOwnerCanChangeIconTitle;
            public boolean sentByPhone;
            public boolean serviceChat;
            public boolean signAdmin;

            public ChatOptions() {
                clear();
            }

            public static ChatOptions[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatOptions[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatOptions) fl9.mergeFrom(new ChatOptions(), bArr);
            }

            public ChatOptions clear() {
                this.signAdmin = false;
                this.onlyOwnerCanChangeIconTitle = false;
                this.official = false;
                this.allCanPinMessage = false;
                this.onlyAdminCanAddMember = false;
                this.onlyAdminCanCall = false;
                this.sentByPhone = false;
                this.serviceChat = false;
                this.membersCanSeePrivateLink = false;
                this.contentLevelChat = false;
                this.aPlusChannel = false;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int iA = this.signAdmin ? hd3.a(1) : 0;
                if (this.onlyOwnerCanChangeIconTitle) {
                    iA += hd3.a(2);
                }
                if (this.official) {
                    iA += hd3.a(3);
                }
                if (this.allCanPinMessage) {
                    iA += hd3.a(4);
                }
                if (this.onlyAdminCanAddMember) {
                    iA += hd3.a(5);
                }
                if (this.onlyAdminCanCall) {
                    iA += hd3.a(7);
                }
                if (this.sentByPhone) {
                    iA += hd3.a(8);
                }
                if (this.serviceChat) {
                    iA += hd3.a(9);
                }
                if (this.membersCanSeePrivateLink) {
                    iA += hd3.a(10);
                }
                if (this.contentLevelChat) {
                    iA += hd3.a(11);
                }
                return this.aPlusChannel ? hd3.a(12) + iA : iA;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                boolean z = this.signAdmin;
                if (z) {
                    hd3Var.r(1, z);
                }
                boolean z2 = this.onlyOwnerCanChangeIconTitle;
                if (z2) {
                    hd3Var.r(2, z2);
                }
                boolean z3 = this.official;
                if (z3) {
                    hd3Var.r(3, z3);
                }
                boolean z4 = this.allCanPinMessage;
                if (z4) {
                    hd3Var.r(4, z4);
                }
                boolean z5 = this.onlyAdminCanAddMember;
                if (z5) {
                    hd3Var.r(5, z5);
                }
                boolean z6 = this.onlyAdminCanCall;
                if (z6) {
                    hd3Var.r(7, z6);
                }
                boolean z7 = this.sentByPhone;
                if (z7) {
                    hd3Var.r(8, z7);
                }
                boolean z8 = this.serviceChat;
                if (z8) {
                    hd3Var.r(9, z8);
                }
                boolean z9 = this.membersCanSeePrivateLink;
                if (z9) {
                    hd3Var.r(10, z9);
                }
                boolean z10 = this.contentLevelChat;
                if (z10) {
                    hd3Var.r(11, z10);
                }
                boolean z11 = this.aPlusChannel;
                if (z11) {
                    hd3Var.r(12, z11);
                }
            }

            public static ChatOptions parseFrom(gd3 gd3Var) throws IOException {
                return new ChatOptions().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ChatOptions mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            this.signAdmin = gd3Var.f();
                            break;
                        case 16:
                            this.onlyOwnerCanChangeIconTitle = gd3Var.f();
                            break;
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                            this.official = gd3Var.f();
                            break;
                        case 32:
                            this.allCanPinMessage = gd3Var.f();
                            break;
                        case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                            this.onlyAdminCanAddMember = gd3Var.f();
                            break;
                        case 56:
                            this.onlyAdminCanCall = gd3Var.f();
                            break;
                        case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                            this.sentByPhone = gd3Var.f();
                            break;
                        case 72:
                            this.serviceChat = gd3Var.f();
                            break;
                        case 80:
                            this.membersCanSeePrivateLink = gd3Var.f();
                            break;
                        case 88:
                            this.contentLevelChat = gd3Var.f();
                            break;
                        case 96:
                            this.aPlusChannel = gd3Var.f();
                            break;
                        default:
                            if (!gd3Var.u(iS)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }
        }

        public static final class ChatSettings extends fl9 {
            private static volatile ChatSettings[] _emptyArray;
            public long dontDisturbUntil;
            public long favoriteIndex;
            public boolean hideLiveLocationPanel;
            public long hideLiveLocationPanelBeforeTime;
            public long hideMyLiveLocationPanelBeforeTime;
            public long lastNotifMark;
            public long lastNotifMessageId;
            public int[] options;

            public ChatSettings() {
                clear();
            }

            public static ChatSettings[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSettings[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSettings) fl9.mergeFrom(new ChatSettings(), bArr);
            }

            public ChatSettings clear() {
                this.dontDisturbUntil = 0L;
                this.options = coi.a;
                this.lastNotifMark = 0L;
                this.favoriteIndex = 0L;
                this.hideLiveLocationPanel = false;
                this.hideMyLiveLocationPanelBeforeTime = 0L;
                this.hideLiveLocationPanelBeforeTime = 0L;
                this.lastNotifMessageId = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int[] iArr;
                long j = this.dontDisturbUntil;
                int i = 0;
                int iH = j != 0 ? hd3.h(1, j) : 0;
                int[] iArr2 = this.options;
                if (iArr2 != null && iArr2.length > 0) {
                    int iG = 0;
                    while (true) {
                        iArr = this.options;
                        if (i >= iArr.length) {
                            break;
                        }
                        iG += hd3.g(iArr[i]);
                        i++;
                    }
                    iH = iH + iG + iArr.length;
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    iH += hd3.h(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    iH += hd3.h(4, j3);
                }
                if (this.hideLiveLocationPanel) {
                    iH += hd3.a(6);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    iH += hd3.h(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    iH += hd3.h(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                return j6 != 0 ? hd3.h(9, j6) + iH : iH;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long j = this.dontDisturbUntil;
                if (j != 0) {
                    hd3Var.x(1, j);
                }
                int[] iArr = this.options;
                if (iArr != null && iArr.length > 0) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.options;
                        if (i >= iArr2.length) {
                            break;
                        }
                        hd3Var.w(2, iArr2[i]);
                        i++;
                    }
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    hd3Var.x(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    hd3Var.x(4, j3);
                }
                boolean z = this.hideLiveLocationPanel;
                if (z) {
                    hd3Var.r(6, z);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    hd3Var.x(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    hd3Var.x(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                if (j6 != 0) {
                    hd3Var.x(9, j6);
                }
            }

            public static ChatSettings parseFrom(gd3 gd3Var) throws IOException {
                return new ChatSettings().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ChatSettings mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS != 8) {
                        if (iS != 16) {
                            if (iS != 18) {
                                if (iS != 24) {
                                    if (iS != 32) {
                                        if (iS != 48) {
                                            if (iS != 56) {
                                                if (iS != 64) {
                                                    if (iS != 72) {
                                                        if (!gd3Var.u(iS)) {
                                                            break;
                                                        }
                                                    } else {
                                                        this.lastNotifMessageId = gd3Var.q();
                                                    }
                                                } else {
                                                    this.hideLiveLocationPanelBeforeTime = gd3Var.q();
                                                }
                                            } else {
                                                this.hideMyLiveLocationPanelBeforeTime = gd3Var.q();
                                            }
                                        } else {
                                            this.hideLiveLocationPanel = gd3Var.f();
                                        }
                                    } else {
                                        this.favoriteIndex = gd3Var.q();
                                    }
                                } else {
                                    this.lastNotifMark = gd3Var.q();
                                }
                            } else {
                                int iE = gd3Var.e(gd3Var.p());
                                int iC = gd3Var.c();
                                int i = 0;
                                while (gd3Var.b() > 0) {
                                    int iP = gd3Var.p();
                                    if (iP == 0 || iP == 1 || iP == 2) {
                                        i++;
                                    }
                                }
                                if (i != 0) {
                                    gd3Var.t(iC);
                                    int[] iArr = this.options;
                                    int length = iArr == null ? 0 : iArr.length;
                                    int[] iArr2 = new int[i + length];
                                    if (length != 0) {
                                        System.arraycopy(iArr, 0, iArr2, 0, length);
                                    }
                                    while (gd3Var.b() > 0) {
                                        int iP2 = gd3Var.p();
                                        if (iP2 == 0 || iP2 == 1 || iP2 == 2) {
                                            iArr2[length] = iP2;
                                            length++;
                                        }
                                    }
                                    this.options = iArr2;
                                }
                                gd3Var.d(iE);
                            }
                        } else {
                            int iB = coi.b(gd3Var, 16);
                            int[] iArr3 = new int[iB];
                            int i2 = 0;
                            for (int i3 = 0; i3 < iB; i3++) {
                                if (i3 != 0) {
                                    gd3Var.s();
                                }
                                int iP3 = gd3Var.p();
                                if (iP3 == 0 || iP3 == 1 || iP3 == 2) {
                                    iArr3[i2] = iP3;
                                    i2++;
                                }
                            }
                            if (i2 != 0) {
                                int[] iArr4 = this.options;
                                int length2 = iArr4 == null ? 0 : iArr4.length;
                                if (length2 == 0 && i2 == iB) {
                                    this.options = iArr3;
                                } else {
                                    int[] iArr5 = new int[length2 + i2];
                                    if (length2 != 0) {
                                        System.arraycopy(iArr4, 0, iArr5, 0, length2);
                                    }
                                    System.arraycopy(iArr3, 0, iArr5, length2, i2);
                                    this.options = iArr5;
                                }
                            }
                        }
                    } else {
                        this.dontDisturbUntil = gd3Var.q();
                    }
                }
                return this;
            }
        }

        public static final class ChatSubject extends fl9 {
            private static volatile ChatSubject[] _emptyArray;
            public long[] organizationIds;

            public ChatSubject() {
                clear();
            }

            public static ChatSubject[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSubject[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSubject parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSubject) fl9.mergeFrom(new ChatSubject(), bArr);
            }

            public ChatSubject clear() {
                this.organizationIds = coi.b;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long[] jArr = this.organizationIds;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int iK = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return iK + jArr2.length;
                    }
                    iK += hd3.k(jArr2[i]);
                    i++;
                }
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long[] jArr = this.organizationIds;
                if (jArr == null || jArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return;
                    }
                    hd3Var.x(1, jArr2[i]);
                    i++;
                }
            }

            public static ChatSubject parseFrom(gd3 gd3Var) throws IOException {
                return new ChatSubject().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ChatSubject mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        int iB = coi.b(gd3Var, 8);
                        long[] jArr = this.organizationIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.organizationIds = jArr2;
                    } else if (iS == 10) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.organizationIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.organizationIds = jArr4;
                        gd3Var.d(iE);
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class Chunk extends fl9 {
            private static volatile Chunk[] _emptyArray;
            public long endTime;
            public long startTime;

            public Chunk() {
                clear();
            }

            public static Chunk[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Chunk[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Chunk parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Chunk) fl9.mergeFrom(new Chunk(), bArr);
            }

            public Chunk clear() {
                this.startTime = 0L;
                this.endTime = 0L;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long j = this.startTime;
                int iH = j != 0 ? hd3.h(1, j) : 0;
                long j2 = this.endTime;
                return j2 != 0 ? hd3.h(2, j2) + iH : iH;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long j = this.startTime;
                if (j != 0) {
                    hd3Var.x(1, j);
                }
                long j2 = this.endTime;
                if (j2 != 0) {
                    hd3Var.x(2, j2);
                }
            }

            public static Chunk parseFrom(gd3 gd3Var) throws IOException {
                return new Chunk().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public Chunk mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.startTime = gd3Var.q();
                    } else if (iS == 16) {
                        this.endTime = gd3Var.q();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class GroupChatInfo extends fl9 {
            public static final int ALL = 2;
            public static final int DISABLED = 0;
            public static final int MEMBERS = 1;
            private static volatile GroupChatInfo[] _emptyArray;
            public String baseIconUrl;
            public long groupId;
            public GroupOptions groupOptions;
            public boolean isAnswered;
            public boolean isCustomTitle;
            public boolean isImportant;
            public boolean isMember;
            public boolean isModerator;
            public int messagingPermissions;
            public String name;

            public static final class GroupOptions extends fl9 {
                private static volatile GroupOptions[] _emptyArray;
                public boolean groupPremium;

                public GroupOptions() {
                    clear();
                }

                public static GroupOptions[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (kp7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new GroupOptions[0];
                                }
                            } finally {
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static GroupOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (GroupOptions) fl9.mergeFrom(new GroupOptions(), bArr);
                }

                public GroupOptions clear() {
                    this.groupPremium = false;
                    this.cachedSize = -1;
                    return this;
                }

                @Override // defpackage.fl9
                public int computeSerializedSize() {
                    if (this.groupPremium) {
                        return hd3.a(1);
                    }
                    return 0;
                }

                @Override // defpackage.fl9
                public void writeTo(hd3 hd3Var) throws IOException {
                    boolean z = this.groupPremium;
                    if (z) {
                        hd3Var.r(1, z);
                    }
                }

                public static GroupOptions parseFrom(gd3 gd3Var) throws IOException {
                    return new GroupOptions().mergeFrom(gd3Var);
                }

                @Override // defpackage.fl9
                public GroupOptions mergeFrom(gd3 gd3Var) throws IOException {
                    while (true) {
                        int iS = gd3Var.s();
                        if (iS == 0) {
                            break;
                        }
                        if (iS == 8) {
                            this.groupPremium = gd3Var.f();
                        } else if (!gd3Var.u(iS)) {
                            break;
                        }
                    }
                    return this;
                }
            }

            public GroupChatInfo() {
                clear();
            }

            public static GroupChatInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new GroupChatInfo[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static GroupChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (GroupChatInfo) fl9.mergeFrom(new GroupChatInfo(), bArr);
            }

            public GroupChatInfo clear() {
                this.groupId = 0L;
                this.isAnswered = false;
                this.isModerator = false;
                this.isImportant = false;
                this.name = "";
                this.baseIconUrl = "";
                this.isCustomTitle = false;
                this.isMember = false;
                this.messagingPermissions = 0;
                this.groupOptions = null;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long j = this.groupId;
                int iH = j != 0 ? hd3.h(1, j) : 0;
                if (this.isAnswered) {
                    iH += hd3.a(2);
                }
                if (this.isModerator) {
                    iH += hd3.a(3);
                }
                if (this.isImportant) {
                    iH += hd3.a(4);
                }
                if (!this.name.equals("")) {
                    iH += hd3.l(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    iH += hd3.l(6, this.baseIconUrl);
                }
                if (this.isCustomTitle) {
                    iH += hd3.a(7);
                }
                if (this.isMember) {
                    iH += hd3.a(8);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    iH += hd3.f(9, i);
                }
                GroupOptions groupOptions = this.groupOptions;
                return groupOptions != null ? hd3.i(10, groupOptions) + iH : iH;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long j = this.groupId;
                if (j != 0) {
                    hd3Var.x(1, j);
                }
                boolean z = this.isAnswered;
                if (z) {
                    hd3Var.r(2, z);
                }
                boolean z2 = this.isModerator;
                if (z2) {
                    hd3Var.r(3, z2);
                }
                boolean z3 = this.isImportant;
                if (z3) {
                    hd3Var.r(4, z3);
                }
                if (!this.name.equals("")) {
                    hd3Var.E(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    hd3Var.E(6, this.baseIconUrl);
                }
                boolean z4 = this.isCustomTitle;
                if (z4) {
                    hd3Var.r(7, z4);
                }
                boolean z5 = this.isMember;
                if (z5) {
                    hd3Var.r(8, z5);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    hd3Var.w(9, i);
                }
                GroupOptions groupOptions = this.groupOptions;
                if (groupOptions != null) {
                    hd3Var.y(10, groupOptions);
                }
            }

            public static GroupChatInfo parseFrom(gd3 gd3Var) throws IOException {
                return new GroupChatInfo().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public GroupChatInfo mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            this.groupId = gd3Var.q();
                            break;
                        case 16:
                            this.isAnswered = gd3Var.f();
                            break;
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                            this.isModerator = gd3Var.f();
                            break;
                        case 32:
                            this.isImportant = gd3Var.f();
                            break;
                        case 42:
                            this.name = gd3Var.r();
                            break;
                        case 50:
                            this.baseIconUrl = gd3Var.r();
                            break;
                        case 56:
                            this.isCustomTitle = gd3Var.f();
                            break;
                        case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                            this.isMember = gd3Var.f();
                            break;
                        case 72:
                            int iP = gd3Var.p();
                            if (iP != 0 && iP != 1 && iP != 2) {
                                break;
                            } else {
                                this.messagingPermissions = iP;
                                break;
                            }
                            break;
                        case 82:
                            if (this.groupOptions == null) {
                                this.groupOptions = new GroupOptions();
                            }
                            gd3Var.j(this.groupOptions);
                            break;
                        default:
                            if (!gd3Var.u(iS)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }
        }

        public static final class LastInputMedia extends fl9 {
            private static volatile LastInputMedia[] _emptyArray;
            public String attachLocalId;
            public long dateModified;
            public String editedUri;
            public String mimeType;
            public long originalDuration;
            public long originalId;
            public int originalOrientation;
            public String originalUri;
            public String thumbnailUri;
            public int type;
            public int[] wave;

            public LastInputMedia() {
                clear();
            }

            public static LastInputMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LastInputMedia[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static LastInputMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LastInputMedia) fl9.mergeFrom(new LastInputMedia(), bArr);
            }

            public LastInputMedia clear() {
                this.originalId = 0L;
                this.originalUri = "";
                this.thumbnailUri = "";
                this.originalOrientation = 0;
                this.originalDuration = 0L;
                this.mimeType = "";
                this.dateModified = 0L;
                this.editedUri = "";
                this.type = 0;
                this.wave = coi.a;
                this.attachLocalId = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int[] iArr;
                long j = this.originalId;
                int i = 0;
                int iH = j != 0 ? hd3.h(1, j) : 0;
                if (!this.originalUri.equals("")) {
                    iH += hd3.l(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    iH += hd3.l(3, this.thumbnailUri);
                }
                int i2 = this.originalOrientation;
                if (i2 != 0) {
                    iH += hd3.f(4, i2);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    iH += hd3.h(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    iH += hd3.l(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    iH += hd3.h(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    iH += hd3.l(8, this.editedUri);
                }
                int i3 = this.type;
                if (i3 != 0) {
                    iH += hd3.f(9, i3);
                }
                int[] iArr2 = this.wave;
                if (iArr2 != null && iArr2.length > 0) {
                    int iG = 0;
                    while (true) {
                        iArr = this.wave;
                        if (i >= iArr.length) {
                            break;
                        }
                        iG += hd3.g(iArr[i]);
                        i++;
                    }
                    iH = iH + iG + iArr.length;
                }
                return !this.attachLocalId.equals("") ? hd3.l(12, this.attachLocalId) + iH : iH;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long j = this.originalId;
                if (j != 0) {
                    hd3Var.x(1, j);
                }
                if (!this.originalUri.equals("")) {
                    hd3Var.E(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    hd3Var.E(3, this.thumbnailUri);
                }
                int i = this.originalOrientation;
                if (i != 0) {
                    hd3Var.w(4, i);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    hd3Var.x(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    hd3Var.E(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    hd3Var.x(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    hd3Var.E(8, this.editedUri);
                }
                int i2 = this.type;
                if (i2 != 0) {
                    hd3Var.w(9, i2);
                }
                int[] iArr = this.wave;
                if (iArr != null && iArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.wave;
                        if (i3 >= iArr2.length) {
                            break;
                        }
                        hd3Var.w(11, iArr2[i3]);
                        i3++;
                    }
                }
                if (this.attachLocalId.equals("")) {
                    return;
                }
                hd3Var.E(12, this.attachLocalId);
            }

            public static LastInputMedia parseFrom(gd3 gd3Var) throws IOException {
                return new LastInputMedia().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public LastInputMedia mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    switch (iS) {
                        case 0:
                            break;
                        case 8:
                            this.originalId = gd3Var.q();
                            break;
                        case 18:
                            this.originalUri = gd3Var.r();
                            break;
                        case 26:
                            this.thumbnailUri = gd3Var.r();
                            break;
                        case 32:
                            this.originalOrientation = gd3Var.p();
                            break;
                        case SavedMessagesIconDrawable.SMALL_SIZE /* 40 */:
                            this.originalDuration = gd3Var.q();
                            break;
                        case 50:
                            this.mimeType = gd3Var.r();
                            break;
                        case 56:
                            this.dateModified = gd3Var.q();
                            break;
                        case 66:
                            this.editedUri = gd3Var.r();
                            break;
                        case 72:
                            this.type = gd3Var.p();
                            break;
                        case 88:
                            int iB = coi.b(gd3Var, 88);
                            int[] iArr = this.wave;
                            int length = iArr == null ? 0 : iArr.length;
                            int i = iB + length;
                            int[] iArr2 = new int[i];
                            if (length != 0) {
                                System.arraycopy(iArr, 0, iArr2, 0, length);
                            }
                            while (length < i - 1) {
                                iArr2[length] = gd3Var.p();
                                gd3Var.s();
                                length++;
                            }
                            iArr2[length] = gd3Var.p();
                            this.wave = iArr2;
                            break;
                        case 90:
                            int iE = gd3Var.e(gd3Var.p());
                            int iC = gd3Var.c();
                            int i2 = 0;
                            while (gd3Var.b() > 0) {
                                gd3Var.p();
                                i2++;
                            }
                            gd3Var.t(iC);
                            int[] iArr3 = this.wave;
                            int length2 = iArr3 == null ? 0 : iArr3.length;
                            int i3 = i2 + length2;
                            int[] iArr4 = new int[i3];
                            if (length2 != 0) {
                                System.arraycopy(iArr3, 0, iArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                iArr4[length2] = gd3Var.p();
                                length2++;
                            }
                            this.wave = iArr4;
                            gd3Var.d(iE);
                            break;
                        case 98:
                            this.attachLocalId = gd3Var.r();
                            break;
                        default:
                            if (!gd3Var.u(iS)) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                return this;
            }
        }

        public static final class PushMessage extends fl9 {
            private static volatile PushMessage[] _emptyArray;
            public long id;
            public String text;
            public long time;

            public PushMessage() {
                clear();
            }

            public static PushMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new PushMessage[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (PushMessage) fl9.mergeFrom(new PushMessage(), bArr);
            }

            public PushMessage clear() {
                this.id = 0L;
                this.time = 0L;
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long j = this.id;
                int iH = j != 0 ? hd3.h(1, j) : 0;
                long j2 = this.time;
                if (j2 != 0) {
                    iH += hd3.h(2, j2);
                }
                return !this.text.equals("") ? hd3.l(3, this.text) + iH : iH;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                long j = this.id;
                if (j != 0) {
                    hd3Var.x(1, j);
                }
                long j2 = this.time;
                if (j2 != 0) {
                    hd3Var.x(2, j2);
                }
                if (this.text.equals("")) {
                    return;
                }
                hd3Var.E(3, this.text);
            }

            public static PushMessage parseFrom(gd3 gd3Var) throws IOException {
                return new PushMessage().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public PushMessage mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 8) {
                        this.id = gd3Var.q();
                    } else if (iS == 16) {
                        this.time = gd3Var.q();
                    } else if (iS == 26) {
                        this.text = gd3Var.r();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class Section extends fl9 {
            private static volatile Section[] _emptyArray;
            public boolean collapsed;
            public String id;
            public long marker;
            public long[] stickerSets;
            public long[] stickers;
            public String title;
            public int totalCount;

            public Section() {
                clear();
            }

            public static Section[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Section[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Section) fl9.mergeFrom(new Section(), bArr);
            }

            public Section clear() {
                this.id = "";
                this.title = "";
                long[] jArr = coi.b;
                this.stickers = jArr;
                this.marker = 0L;
                this.collapsed = false;
                this.stickerSets = jArr;
                this.totalCount = 0;
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long[] jArr;
                long[] jArr2;
                int i = 0;
                int iL = !this.id.equals("") ? hd3.l(1, this.id) : 0;
                if (!this.title.equals("")) {
                    iL += hd3.l(2, this.title);
                }
                long[] jArr3 = this.stickers;
                if (jArr3 != null && jArr3.length > 0) {
                    int i2 = 0;
                    int iK = 0;
                    while (true) {
                        jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        iK += hd3.k(jArr2[i2]);
                        i2++;
                    }
                    iL = iL + iK + jArr2.length;
                }
                long j = this.marker;
                if (j != 0) {
                    iL += hd3.h(4, j);
                }
                if (this.collapsed) {
                    iL += hd3.a(5);
                }
                long[] jArr4 = this.stickerSets;
                if (jArr4 != null && jArr4.length > 0) {
                    int iK2 = 0;
                    while (true) {
                        jArr = this.stickerSets;
                        if (i >= jArr.length) {
                            break;
                        }
                        iK2 += hd3.k(jArr[i]);
                        i++;
                    }
                    iL = iL + iK2 + jArr.length;
                }
                int i3 = this.totalCount;
                return i3 != 0 ? hd3.f(7, i3) + iL : iL;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                if (!this.id.equals("")) {
                    hd3Var.E(1, this.id);
                }
                if (!this.title.equals("")) {
                    hd3Var.E(2, this.title);
                }
                long[] jArr = this.stickers;
                int i = 0;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        hd3Var.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                long j = this.marker;
                if (j != 0) {
                    hd3Var.x(4, j);
                }
                boolean z = this.collapsed;
                if (z) {
                    hd3Var.r(5, z);
                }
                long[] jArr3 = this.stickerSets;
                if (jArr3 != null && jArr3.length > 0) {
                    while (true) {
                        long[] jArr4 = this.stickerSets;
                        if (i >= jArr4.length) {
                            break;
                        }
                        hd3Var.x(6, jArr4[i]);
                        i++;
                    }
                }
                int i3 = this.totalCount;
                if (i3 != 0) {
                    hd3Var.w(7, i3);
                }
            }

            public static Section parseFrom(gd3 gd3Var) throws IOException {
                return new Section().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public Section mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.id = gd3Var.r();
                    } else if (iS == 18) {
                        this.title = gd3Var.r();
                    } else if (iS == 24) {
                        int iB = coi.b(gd3Var, 24);
                        long[] jArr = this.stickers;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.stickers = jArr2;
                    } else if (iS == 26) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.stickers;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.stickers = jArr4;
                        gd3Var.d(iE);
                    } else if (iS == 32) {
                        this.marker = gd3Var.q();
                    } else if (iS == 40) {
                        this.collapsed = gd3Var.f();
                    } else if (iS == 48) {
                        int iB2 = coi.b(gd3Var, 48);
                        long[] jArr5 = this.stickerSets;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = iB2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = gd3Var.q();
                            gd3Var.s();
                            length3++;
                        }
                        jArr6[length3] = gd3Var.q();
                        this.stickerSets = jArr6;
                    } else if (iS == 50) {
                        int iE2 = gd3Var.e(gd3Var.p());
                        int iC2 = gd3Var.c();
                        int i5 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i5++;
                        }
                        gd3Var.t(iC2);
                        long[] jArr7 = this.stickerSets;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = gd3Var.q();
                            length4++;
                        }
                        this.stickerSets = jArr8;
                        gd3Var.d(iE2);
                    } else if (iS == 56) {
                        this.totalCount = gd3Var.p();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class VideoConversation extends fl9 {
            public static final int BY_LINK = 1;
            public static final int FROM_CHAT = 2;
            public static final int UNKNOWN = 0;
            private static volatile VideoConversation[] _emptyArray;
            public int approxParticipantCount;
            public String conversationId;
            public String joinLink;
            public String mediaCallType;
            public long[] previewParticipantIds;
            public long startedAt;
            public int type;

            public VideoConversation() {
                clear();
            }

            public static VideoConversation[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new VideoConversation[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static VideoConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (VideoConversation) fl9.mergeFrom(new VideoConversation(), bArr);
            }

            public VideoConversation clear() {
                this.conversationId = "";
                this.startedAt = 0L;
                this.joinLink = "";
                this.approxParticipantCount = 0;
                this.previewParticipantIds = coi.b;
                this.type = 0;
                this.mediaCallType = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                long[] jArr;
                int i = 0;
                int iL = !this.conversationId.equals("") ? hd3.l(1, this.conversationId) : 0;
                long j = this.startedAt;
                if (j != 0) {
                    iL += hd3.h(2, j);
                }
                if (!this.joinLink.equals("")) {
                    iL += hd3.l(3, this.joinLink);
                }
                int i2 = this.approxParticipantCount;
                if (i2 != 0) {
                    iL += hd3.f(4, i2);
                }
                long[] jArr2 = this.previewParticipantIds;
                if (jArr2 != null && jArr2.length > 0) {
                    int iK = 0;
                    while (true) {
                        jArr = this.previewParticipantIds;
                        if (i >= jArr.length) {
                            break;
                        }
                        iK += hd3.k(jArr[i]);
                        i++;
                    }
                    iL = iL + iK + jArr.length;
                }
                int i3 = this.type;
                if (i3 != 0) {
                    iL += hd3.f(6, i3);
                }
                return !this.mediaCallType.equals("") ? hd3.l(7, this.mediaCallType) + iL : iL;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                if (!this.conversationId.equals("")) {
                    hd3Var.E(1, this.conversationId);
                }
                long j = this.startedAt;
                if (j != 0) {
                    hd3Var.x(2, j);
                }
                if (!this.joinLink.equals("")) {
                    hd3Var.E(3, this.joinLink);
                }
                int i = this.approxParticipantCount;
                if (i != 0) {
                    hd3Var.w(4, i);
                }
                long[] jArr = this.previewParticipantIds;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.previewParticipantIds;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        hd3Var.x(5, jArr2[i2]);
                        i2++;
                    }
                }
                int i3 = this.type;
                if (i3 != 0) {
                    hd3Var.w(6, i3);
                }
                if (this.mediaCallType.equals("")) {
                    return;
                }
                hd3Var.E(7, this.mediaCallType);
            }

            public static VideoConversation parseFrom(gd3 gd3Var) throws IOException {
                return new VideoConversation().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public VideoConversation mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.conversationId = gd3Var.r();
                    } else if (iS == 16) {
                        this.startedAt = gd3Var.q();
                    } else if (iS == 26) {
                        this.joinLink = gd3Var.r();
                    } else if (iS == 32) {
                        this.approxParticipantCount = gd3Var.p();
                    } else if (iS == 40) {
                        int iB = coi.b(gd3Var, 40);
                        long[] jArr = this.previewParticipantIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = iB + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = gd3Var.q();
                            gd3Var.s();
                            length++;
                        }
                        jArr2[length] = gd3Var.q();
                        this.previewParticipantIds = jArr2;
                    } else if (iS == 42) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i2++;
                        }
                        gd3Var.t(iC);
                        long[] jArr3 = this.previewParticipantIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = gd3Var.q();
                            length2++;
                        }
                        this.previewParticipantIds = jArr4;
                        gd3Var.d(iE);
                    } else if (iS == 48) {
                        int iP = gd3Var.p();
                        if (iP == 0 || iP == 1 || iP == 2) {
                            this.type = iP;
                        }
                    } else if (iS == 58) {
                        this.mediaCallType = gd3Var.r();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public Chat() {
            clear();
        }

        public static Chat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Chat[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Chat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Chat) fl9.mergeFrom(new Chat(), bArr);
        }

        public Chat clear() {
            this.serverId = 0L;
            this.type = 0;
            this.status = 0;
            this.owner = 0L;
            this.participants = null;
            this.created = 0L;
            this.title = "";
            this.lastMessageId = 0L;
            this.lastEventTime = 0L;
            this.cid = 0L;
            this.newMessages = 0;
            this.chunk = Chunk.emptyArray();
            this.chatSettings = null;
            this.mediaAll = null;
            this.firstMessageId = 0L;
            this.sections = Section.emptyArray();
            this.stickersOrder = coi.d;
            this.stickersSyncTime = 0L;
            this.localChanges = coi.a;
            this.channelInfo = null;
            this.accessType = 0;
            this.link = "";
            this.chatSubject = null;
            this.restrictions = 0;
            this.groupChatInfo = null;
            this.participantsCount = 0;
            this.description = "";
            long[] jArr = coi.b;
            this.admins = jArr;
            this.blockedParticipantsCount = 0;
            this.chatOptions = null;
            this.mediaMusic = null;
            this.mediaAudio = null;
            this.pinnedMessageId = 0L;
            this.hidePinnedMessage = false;
            this.unreadReply = false;
            this.unreadPin = false;
            this.joinTime = 0L;
            this.messagesTtlSec = 0;
            this.adminParticipants = null;
            this.baseIconUrl = "";
            this.baseRawIconUrl = "";
            this.unbindOkPanelCloseTime = 0L;
            this.flagsSettings = 0;
            this.videoConversation = null;
            this.lastOpenPositionTime = 0L;
            this.lastOpenPositionOffset = 0;
            this.lastOpenReadMark = 0L;
            this.lastWriteTime = 0L;
            this.lastSearchClickTime = 0L;
            this.lastOpenNewMessages = 0L;
            this.mediaPhotoVideo = null;
            this.mediaShare = null;
            this.mediaFiles = null;
            this.botsInfo = null;
            this.mediaLocations = null;
            this.modified = 0L;
            this.draft = coi.e;
            this.draftUpdateTime = 0L;
            this.subscribedToUpdates = false;
            this.liveLocationMessageIds = null;
            this.lastMentionMessageId = 0L;
            this.chatFoldersIds = jArr;
            this.draftUpdateTimeForSyncLogic = 0L;
            this.markedAsUnread = false;
            this.lastPushMessage = null;
            this.lastReactedMessageId = 0L;
            this.lastReaction = "";
            this.lastFireDelayedErrorTime = 0L;
            this.lastDelayedUpdateTime = 0L;
            this.delayedChunk = Chunk.emptyArray();
            this.mediaAudioVideoMsg = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            int i2 = this.type;
            if (i2 != 0) {
                iH += hd3.f(2, i2);
            }
            int i3 = this.status;
            if (i3 != 0) {
                iH += hd3.f(3, i3);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                iH += hd3.h(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                iH += kp7.a(map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                iH += hd3.h(6, j3);
            }
            if (!this.title.equals("")) {
                iH += hd3.l(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                iH += hd3.h(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                iH += hd3.h(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                iH += hd3.h(12, j6);
            }
            int i4 = this.newMessages;
            if (i4 != 0) {
                iH += hd3.f(13, i4);
            }
            Chunk[] chunkArr = this.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk = chunkArr2[i5];
                    if (chunk != null) {
                        iH = hd3.i(14, chunk) + iH;
                    }
                    i5++;
                }
            }
            ChatSettings chatSettings = this.chatSettings;
            if (chatSettings != null) {
                iH += hd3.i(16, chatSettings);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                iH += hd3.i(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                iH += hd3.h(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        iH = hd3.i(19, section) + iH;
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                int iJ = 0;
                int i8 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        i8++;
                        int iQ = hd3.q(str);
                        iJ += hd3.j(iQ) + iQ;
                    }
                    i7++;
                }
                iH = iH + iJ + (i8 * 2);
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                iH += hd3.h(21, j8);
            }
            int[] iArr2 = this.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                int i9 = 0;
                int iG = 0;
                while (true) {
                    iArr = this.localChanges;
                    if (i9 >= iArr.length) {
                        break;
                    }
                    iG += hd3.g(iArr[i9]);
                    i9++;
                }
                iH = iH + iG + (iArr.length * 2);
            }
            ChannelInfo channelInfo = this.channelInfo;
            if (channelInfo != null) {
                iH += hd3.i(23, channelInfo);
            }
            int i10 = this.accessType;
            if (i10 != 0) {
                iH += hd3.f(24, i10);
            }
            if (!this.link.equals("")) {
                iH += hd3.l(25, this.link);
            }
            ChatSubject chatSubject = this.chatSubject;
            if (chatSubject != null) {
                iH += hd3.i(26, chatSubject);
            }
            int i11 = this.restrictions;
            if (i11 != 0) {
                iH += hd3.f(27, i11);
            }
            GroupChatInfo groupChatInfo = this.groupChatInfo;
            if (groupChatInfo != null) {
                iH += hd3.i(28, groupChatInfo);
            }
            int i12 = this.participantsCount;
            if (i12 != 0) {
                iH += hd3.f(29, i12);
            }
            if (!this.description.equals("")) {
                iH += hd3.l(30, this.description);
            }
            long[] jArr3 = this.admins;
            if (jArr3 != null && jArr3.length > 0) {
                int i13 = 0;
                int iK = 0;
                while (true) {
                    jArr2 = this.admins;
                    if (i13 >= jArr2.length) {
                        break;
                    }
                    iK += hd3.k(jArr2[i13]);
                    i13++;
                }
                iH = iH + iK + (jArr2.length * 2);
            }
            int i14 = this.blockedParticipantsCount;
            if (i14 != 0) {
                iH += hd3.f(32, i14);
            }
            ChatOptions chatOptions = this.chatOptions;
            if (chatOptions != null) {
                iH += hd3.i(33, chatOptions);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                iH += hd3.i(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                iH += hd3.i(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                iH += hd3.h(36, j9);
            }
            if (this.hidePinnedMessage) {
                iH += hd3.a(37);
            }
            if (this.unreadReply) {
                iH += hd3.a(38);
            }
            if (this.unreadPin) {
                iH += hd3.a(39);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                iH += hd3.h(40, j10);
            }
            int i15 = this.messagesTtlSec;
            if (i15 != 0) {
                iH += hd3.f(42, i15);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                iH += kp7.a(map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                iH += hd3.l(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                iH += hd3.l(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                iH += hd3.h(46, j11);
            }
            int i16 = this.flagsSettings;
            if (i16 != 0) {
                iH += hd3.f(47, i16);
            }
            VideoConversation videoConversation = this.videoConversation;
            if (videoConversation != null) {
                iH += hd3.i(48, videoConversation);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                iH += hd3.h(49, j12);
            }
            int i17 = this.lastOpenPositionOffset;
            if (i17 != 0) {
                iH += hd3.f(50, i17);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                iH += hd3.h(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                iH += hd3.h(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                iH += hd3.h(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                iH += hd3.h(54, j16);
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                iH += hd3.i(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                iH += hd3.i(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                iH += hd3.i(58, chatMedia6);
            }
            BotsInfo botsInfo = this.botsInfo;
            if (botsInfo != null) {
                iH += hd3.i(59, botsInfo);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                iH += hd3.i(60, chatMedia7);
            }
            long j17 = this.modified;
            if (j17 != 0) {
                iH += hd3.h(62, j17);
            }
            if (!Arrays.equals(this.draft, coi.e)) {
                iH += hd3.b(64, this.draft);
            }
            long j18 = this.draftUpdateTime;
            if (j18 != 0) {
                iH += hd3.h(65, j18);
            }
            if (this.subscribedToUpdates) {
                iH += hd3.a(66);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                iH += kp7.a(map3, 67, 3, 3);
            }
            long j19 = this.lastMentionMessageId;
            if (j19 != 0) {
                iH += hd3.h(68, j19);
            }
            long[] jArr4 = this.chatFoldersIds;
            if (jArr4 != null && jArr4.length > 0) {
                int i18 = 0;
                int iK2 = 0;
                while (true) {
                    jArr = this.chatFoldersIds;
                    if (i18 >= jArr.length) {
                        break;
                    }
                    iK2 += hd3.k(jArr[i18]);
                    i18++;
                }
                iH = iH + iK2 + (jArr.length * 2);
            }
            long j20 = this.draftUpdateTimeForSyncLogic;
            if (j20 != 0) {
                iH += hd3.h(70, j20);
            }
            if (this.markedAsUnread) {
                iH += hd3.a(71);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                iH += hd3.i(72, pushMessage);
            }
            long j21 = this.lastReactedMessageId;
            if (j21 != 0) {
                iH += hd3.h(73, j21);
            }
            if (!this.lastReaction.equals("")) {
                iH += hd3.l(74, this.lastReaction);
            }
            long j22 = this.lastFireDelayedErrorTime;
            if (j22 != 0) {
                iH += hd3.h(75, j22);
            }
            long j23 = this.lastDelayedUpdateTime;
            if (j23 != 0) {
                iH += hd3.h(76, j23);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i >= chunkArr4.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr4[i];
                    if (chunk2 != null) {
                        iH = hd3.i(77, chunk2) + iH;
                    }
                    i++;
                }
            }
            ChatMedia chatMedia8 = this.mediaAudioVideoMsg;
            return chatMedia8 != null ? hd3.i(78, chatMedia8) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            int i = this.type;
            if (i != 0) {
                hd3Var.w(2, i);
            }
            int i2 = this.status;
            if (i2 != 0) {
                hd3Var.w(3, i2);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                hd3Var.x(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                kp7.d(hd3Var, map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                hd3Var.x(6, j3);
            }
            if (!this.title.equals("")) {
                hd3Var.E(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                hd3Var.x(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                hd3Var.x(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                hd3Var.x(12, j6);
            }
            int i3 = this.newMessages;
            if (i3 != 0) {
                hd3Var.w(13, i3);
            }
            Chunk[] chunkArr = this.chunk;
            int i4 = 0;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk = chunkArr2[i5];
                    if (chunk != null) {
                        hd3Var.y(14, chunk);
                    }
                    i5++;
                }
            }
            ChatSettings chatSettings = this.chatSettings;
            if (chatSettings != null) {
                hd3Var.y(16, chatSettings);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                hd3Var.y(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                hd3Var.x(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        hd3Var.y(19, section);
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        hd3Var.E(20, str);
                    }
                    i7++;
                }
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                hd3Var.x(21, j8);
            }
            int[] iArr = this.localChanges;
            if (iArr != null && iArr.length > 0) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.localChanges;
                    if (i8 >= iArr2.length) {
                        break;
                    }
                    hd3Var.w(22, iArr2[i8]);
                    i8++;
                }
            }
            ChannelInfo channelInfo = this.channelInfo;
            if (channelInfo != null) {
                hd3Var.y(23, channelInfo);
            }
            int i9 = this.accessType;
            if (i9 != 0) {
                hd3Var.w(24, i9);
            }
            if (!this.link.equals("")) {
                hd3Var.E(25, this.link);
            }
            ChatSubject chatSubject = this.chatSubject;
            if (chatSubject != null) {
                hd3Var.y(26, chatSubject);
            }
            int i10 = this.restrictions;
            if (i10 != 0) {
                hd3Var.w(27, i10);
            }
            GroupChatInfo groupChatInfo = this.groupChatInfo;
            if (groupChatInfo != null) {
                hd3Var.y(28, groupChatInfo);
            }
            int i11 = this.participantsCount;
            if (i11 != 0) {
                hd3Var.w(29, i11);
            }
            if (!this.description.equals("")) {
                hd3Var.E(30, this.description);
            }
            long[] jArr = this.admins;
            if (jArr != null && jArr.length > 0) {
                int i12 = 0;
                while (true) {
                    long[] jArr2 = this.admins;
                    if (i12 >= jArr2.length) {
                        break;
                    }
                    hd3Var.x(31, jArr2[i12]);
                    i12++;
                }
            }
            int i13 = this.blockedParticipantsCount;
            if (i13 != 0) {
                hd3Var.w(32, i13);
            }
            ChatOptions chatOptions = this.chatOptions;
            if (chatOptions != null) {
                hd3Var.y(33, chatOptions);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                hd3Var.y(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                hd3Var.y(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                hd3Var.x(36, j9);
            }
            boolean z = this.hidePinnedMessage;
            if (z) {
                hd3Var.r(37, z);
            }
            boolean z2 = this.unreadReply;
            if (z2) {
                hd3Var.r(38, z2);
            }
            boolean z3 = this.unreadPin;
            if (z3) {
                hd3Var.r(39, z3);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                hd3Var.x(40, j10);
            }
            int i14 = this.messagesTtlSec;
            if (i14 != 0) {
                hd3Var.w(42, i14);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                kp7.d(hd3Var, map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                hd3Var.E(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                hd3Var.E(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                hd3Var.x(46, j11);
            }
            int i15 = this.flagsSettings;
            if (i15 != 0) {
                hd3Var.w(47, i15);
            }
            VideoConversation videoConversation = this.videoConversation;
            if (videoConversation != null) {
                hd3Var.y(48, videoConversation);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                hd3Var.x(49, j12);
            }
            int i16 = this.lastOpenPositionOffset;
            if (i16 != 0) {
                hd3Var.w(50, i16);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                hd3Var.x(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                hd3Var.x(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                hd3Var.x(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                hd3Var.x(54, j16);
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                hd3Var.y(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                hd3Var.y(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                hd3Var.y(58, chatMedia6);
            }
            BotsInfo botsInfo = this.botsInfo;
            if (botsInfo != null) {
                hd3Var.y(59, botsInfo);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                hd3Var.y(60, chatMedia7);
            }
            long j17 = this.modified;
            if (j17 != 0) {
                hd3Var.x(62, j17);
            }
            if (!Arrays.equals(this.draft, coi.e)) {
                hd3Var.s(64, this.draft);
            }
            long j18 = this.draftUpdateTime;
            if (j18 != 0) {
                hd3Var.x(65, j18);
            }
            boolean z4 = this.subscribedToUpdates;
            if (z4) {
                hd3Var.r(66, z4);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                kp7.d(hd3Var, map3, 67, 3, 3);
            }
            long j19 = this.lastMentionMessageId;
            if (j19 != 0) {
                hd3Var.x(68, j19);
            }
            long[] jArr3 = this.chatFoldersIds;
            if (jArr3 != null && jArr3.length > 0) {
                int i17 = 0;
                while (true) {
                    long[] jArr4 = this.chatFoldersIds;
                    if (i17 >= jArr4.length) {
                        break;
                    }
                    hd3Var.x(69, jArr4[i17]);
                    i17++;
                }
            }
            long j20 = this.draftUpdateTimeForSyncLogic;
            if (j20 != 0) {
                hd3Var.x(70, j20);
            }
            boolean z5 = this.markedAsUnread;
            if (z5) {
                hd3Var.r(71, z5);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                hd3Var.y(72, pushMessage);
            }
            long j21 = this.lastReactedMessageId;
            if (j21 != 0) {
                hd3Var.x(73, j21);
            }
            if (!this.lastReaction.equals("")) {
                hd3Var.E(74, this.lastReaction);
            }
            long j22 = this.lastFireDelayedErrorTime;
            if (j22 != 0) {
                hd3Var.x(75, j22);
            }
            long j23 = this.lastDelayedUpdateTime;
            if (j23 != 0) {
                hd3Var.x(76, j23);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i4 >= chunkArr4.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr4[i4];
                    if (chunk2 != null) {
                        hd3Var.y(77, chunk2);
                    }
                    i4++;
                }
            }
            ChatMedia chatMedia8 = this.mediaAudioVideoMsg;
            if (chatMedia8 != null) {
                hd3Var.y(78, chatMedia8);
            }
        }

        public static Chat parseFrom(gd3 gd3Var) throws IOException {
            return new Chat().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public Chat mergeFrom(gd3 gd3Var) throws IOException {
            gd3 gd3Var2;
            tn8 tn8Var = jei.a;
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        gd3Var2 = gd3Var;
                        this.serverId = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 16:
                        gd3Var2 = gd3Var;
                        int iP = gd3Var2.p();
                        if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                            this.type = iP;
                            continue;
                        }
                        gd3Var = gd3Var2;
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                        gd3Var2 = gd3Var;
                        int iP2 = gd3Var2.p();
                        switch (iP2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.status = iP2;
                                continue;
                        }
                        gd3Var = gd3Var2;
                        break;
                    case 32:
                        gd3Var2 = gd3Var;
                        this.owner = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 42:
                        gd3Var2 = gd3Var;
                        this.participants = kp7.b(gd3Var2, this.participants, tn8Var, 3, 3, null, 8, 16);
                        continue;
                        gd3Var = gd3Var2;
                    case 48:
                        gd3Var2 = gd3Var;
                        this.created = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 58:
                        gd3Var2 = gd3Var;
                        this.title = gd3Var2.r();
                        continue;
                        gd3Var = gd3Var2;
                    case 80:
                        gd3Var2 = gd3Var;
                        this.lastMessageId = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 88:
                        gd3Var2 = gd3Var;
                        this.lastEventTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 96:
                        gd3Var2 = gd3Var;
                        this.cid = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 104:
                        gd3Var2 = gd3Var;
                        this.newMessages = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case 114:
                        gd3Var2 = gd3Var;
                        int iB = coi.b(gd3Var2, 114);
                        Chunk[] chunkArr = this.chunk;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = iB + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk = new Chunk();
                            chunkArr2[length] = chunk;
                            gd3Var2.j(chunk);
                            gd3Var2.s();
                            length++;
                        }
                        Chunk chunk2 = new Chunk();
                        chunkArr2[length] = chunk2;
                        gd3Var2.j(chunk2);
                        this.chunk = chunkArr2;
                        continue;
                        gd3Var = gd3Var2;
                    case 130:
                        gd3Var2 = gd3Var;
                        if (this.chatSettings == null) {
                            this.chatSettings = new ChatSettings();
                        }
                        gd3Var2.j(this.chatSettings);
                        continue;
                        gd3Var = gd3Var2;
                    case 138:
                        gd3Var2 = gd3Var;
                        if (this.mediaAll == null) {
                            this.mediaAll = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaAll);
                        continue;
                        gd3Var = gd3Var2;
                    case 144:
                        gd3Var2 = gd3Var;
                        this.firstMessageId = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 154:
                        gd3Var2 = gd3Var;
                        int iB2 = coi.b(gd3Var2, 154);
                        Section[] sectionArr = this.sections;
                        int length2 = sectionArr == null ? 0 : sectionArr.length;
                        int i2 = iB2 + length2;
                        Section[] sectionArr2 = new Section[i2];
                        if (length2 != 0) {
                            System.arraycopy(sectionArr, 0, sectionArr2, 0, length2);
                        }
                        while (length2 < i2 - 1) {
                            Section section = new Section();
                            sectionArr2[length2] = section;
                            gd3Var2.j(section);
                            gd3Var2.s();
                            length2++;
                        }
                        Section section2 = new Section();
                        sectionArr2[length2] = section2;
                        gd3Var2.j(section2);
                        this.sections = sectionArr2;
                        continue;
                        gd3Var = gd3Var2;
                    case 162:
                        gd3Var2 = gd3Var;
                        int iB3 = coi.b(gd3Var2, 162);
                        String[] strArr = this.stickersOrder;
                        int length3 = strArr == null ? 0 : strArr.length;
                        int i3 = iB3 + length3;
                        String[] strArr2 = new String[i3];
                        if (length3 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length3);
                        }
                        while (length3 < i3 - 1) {
                            strArr2[length3] = gd3Var2.r();
                            gd3Var2.s();
                            length3++;
                        }
                        strArr2[length3] = gd3Var2.r();
                        this.stickersOrder = strArr2;
                        continue;
                        gd3Var = gd3Var2;
                    case 168:
                        gd3Var2 = gd3Var;
                        this.stickersSyncTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 176:
                        gd3Var2 = gd3Var;
                        int iB4 = coi.b(gd3Var2, 176);
                        int[] iArr = this.localChanges;
                        int length4 = iArr == null ? 0 : iArr.length;
                        int i4 = iB4 + length4;
                        int[] iArr2 = new int[i4];
                        if (length4 != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length4);
                        }
                        while (length4 < i4 - 1) {
                            iArr2[length4] = gd3Var2.p();
                            gd3Var2.s();
                            length4++;
                        }
                        iArr2[length4] = gd3Var2.p();
                        this.localChanges = iArr2;
                        continue;
                        gd3Var = gd3Var2;
                    case 178:
                        gd3Var2 = gd3Var;
                        int iE = gd3Var2.e(gd3Var2.p());
                        int iC = gd3Var2.c();
                        int i5 = 0;
                        while (gd3Var2.b() > 0) {
                            gd3Var2.p();
                            i5++;
                        }
                        gd3Var2.t(iC);
                        int[] iArr3 = this.localChanges;
                        int length5 = iArr3 == null ? 0 : iArr3.length;
                        int i6 = i5 + length5;
                        int[] iArr4 = new int[i6];
                        if (length5 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length5);
                        }
                        while (length5 < i6) {
                            iArr4[length5] = gd3Var2.p();
                            length5++;
                        }
                        this.localChanges = iArr4;
                        gd3Var2.d(iE);
                        continue;
                        gd3Var = gd3Var2;
                    case 186:
                        gd3Var2 = gd3Var;
                        if (this.channelInfo == null) {
                            this.channelInfo = new ChannelInfo();
                        }
                        gd3Var2.j(this.channelInfo);
                        continue;
                        gd3Var = gd3Var2;
                    case 192:
                        gd3Var2 = gd3Var;
                        int iP3 = gd3Var2.p();
                        if (iP3 == 0 || iP3 == 1) {
                            this.accessType = iP3;
                            continue;
                        }
                        gd3Var = gd3Var2;
                    case HttpStatus.SC_ACCEPTED /* 202 */:
                        gd3Var2 = gd3Var;
                        this.link = gd3Var2.r();
                        continue;
                        gd3Var = gd3Var2;
                    case 210:
                        gd3Var2 = gd3Var;
                        if (this.chatSubject == null) {
                            this.chatSubject = new ChatSubject();
                        }
                        gd3Var2.j(this.chatSubject);
                        continue;
                        gd3Var = gd3Var2;
                    case 216:
                        gd3Var2 = gd3Var;
                        this.restrictions = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case 226:
                        gd3Var2 = gd3Var;
                        if (this.groupChatInfo == null) {
                            this.groupChatInfo = new GroupChatInfo();
                        }
                        gd3Var2.j(this.groupChatInfo);
                        continue;
                        gd3Var = gd3Var2;
                    case 232:
                        gd3Var2 = gd3Var;
                        this.participantsCount = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case 242:
                        gd3Var2 = gd3Var;
                        this.description = gd3Var2.r();
                        continue;
                        gd3Var = gd3Var2;
                    case 248:
                        gd3Var2 = gd3Var;
                        int iB5 = coi.b(gd3Var2, 248);
                        long[] jArr = this.admins;
                        int length6 = jArr == null ? 0 : jArr.length;
                        int i7 = iB5 + length6;
                        long[] jArr2 = new long[i7];
                        if (length6 != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length6);
                        }
                        while (length6 < i7 - 1) {
                            jArr2[length6] = gd3Var2.q();
                            gd3Var2.s();
                            length6++;
                        }
                        jArr2[length6] = gd3Var2.q();
                        this.admins = jArr2;
                        continue;
                        gd3Var = gd3Var2;
                    case 250:
                        gd3Var2 = gd3Var;
                        int iE2 = gd3Var2.e(gd3Var2.p());
                        int iC2 = gd3Var2.c();
                        int i8 = 0;
                        while (gd3Var2.b() > 0) {
                            gd3Var2.q();
                            i8++;
                        }
                        gd3Var2.t(iC2);
                        long[] jArr3 = this.admins;
                        int length7 = jArr3 == null ? 0 : jArr3.length;
                        int i9 = i8 + length7;
                        long[] jArr4 = new long[i9];
                        if (length7 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length7);
                        }
                        while (length7 < i9) {
                            jArr4[length7] = gd3Var2.q();
                            length7++;
                        }
                        this.admins = jArr4;
                        gd3Var2.d(iE2);
                        continue;
                        gd3Var = gd3Var2;
                    case 256:
                        gd3Var2 = gd3Var;
                        this.blockedParticipantsCount = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case 266:
                        gd3Var2 = gd3Var;
                        if (this.chatOptions == null) {
                            this.chatOptions = new ChatOptions();
                        }
                        gd3Var2.j(this.chatOptions);
                        continue;
                        gd3Var = gd3Var2;
                    case 274:
                        gd3Var2 = gd3Var;
                        if (this.mediaMusic == null) {
                            this.mediaMusic = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaMusic);
                        continue;
                        gd3Var = gd3Var2;
                    case 282:
                        gd3Var2 = gd3Var;
                        if (this.mediaAudio == null) {
                            this.mediaAudio = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaAudio);
                        continue;
                        gd3Var = gd3Var2;
                    case 288:
                        gd3Var2 = gd3Var;
                        this.pinnedMessageId = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 296:
                        gd3Var2 = gd3Var;
                        this.hidePinnedMessage = gd3Var2.f();
                        continue;
                        gd3Var = gd3Var2;
                    case HttpStatus.SC_NOT_MODIFIED /* 304 */:
                        gd3Var2 = gd3Var;
                        this.unreadReply = gd3Var2.f();
                        continue;
                        gd3Var = gd3Var2;
                    case 312:
                        gd3Var2 = gd3Var;
                        this.unreadPin = gd3Var2.f();
                        continue;
                        gd3Var = gd3Var2;
                    case 320:
                        gd3Var2 = gd3Var;
                        this.joinTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 336:
                        gd3Var2 = gd3Var;
                        this.messagesTtlSec = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case 346:
                        gd3Var2 = gd3Var;
                        this.adminParticipants = kp7.b(gd3Var2, this.adminParticipants, tn8Var, 3, 11, new AdminParticipant(), 8, 18);
                        continue;
                        gd3Var = gd3Var2;
                    case 354:
                        gd3Var2 = gd3Var;
                        this.baseIconUrl = gd3Var2.r();
                        continue;
                        gd3Var = gd3Var2;
                    case 362:
                        gd3Var2 = gd3Var;
                        this.baseRawIconUrl = gd3Var2.r();
                        continue;
                        gd3Var = gd3Var2;
                    case 368:
                        gd3Var2 = gd3Var;
                        this.unbindOkPanelCloseTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 376:
                        gd3Var2 = gd3Var;
                        this.flagsSettings = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case 386:
                        gd3Var2 = gd3Var;
                        if (this.videoConversation == null) {
                            this.videoConversation = new VideoConversation();
                        }
                        gd3Var2.j(this.videoConversation);
                        continue;
                        gd3Var = gd3Var2;
                    case 392:
                        gd3Var2 = gd3Var;
                        this.lastOpenPositionTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case HttpStatus.SC_BAD_REQUEST /* 400 */:
                        gd3Var2 = gd3Var;
                        this.lastOpenPositionOffset = gd3Var2.p();
                        continue;
                        gd3Var = gd3Var2;
                    case HttpStatus.SC_REQUEST_TIMEOUT /* 408 */:
                        gd3Var2 = gd3Var;
                        this.lastOpenReadMark = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                        gd3Var2 = gd3Var;
                        this.lastWriteTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case HttpStatus.SC_FAILED_DEPENDENCY /* 424 */:
                        gd3Var2 = gd3Var;
                        this.lastSearchClickTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 432:
                        gd3Var2 = gd3Var;
                        this.lastOpenNewMessages = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 450:
                        gd3Var2 = gd3Var;
                        if (this.mediaPhotoVideo == null) {
                            this.mediaPhotoVideo = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaPhotoVideo);
                        continue;
                        gd3Var = gd3Var2;
                    case 458:
                        gd3Var2 = gd3Var;
                        if (this.mediaShare == null) {
                            this.mediaShare = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaShare);
                        continue;
                        gd3Var = gd3Var2;
                    case 466:
                        gd3Var2 = gd3Var;
                        if (this.mediaFiles == null) {
                            this.mediaFiles = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaFiles);
                        continue;
                        gd3Var = gd3Var2;
                    case 474:
                        gd3Var2 = gd3Var;
                        if (this.botsInfo == null) {
                            this.botsInfo = new BotsInfo();
                        }
                        gd3Var2.j(this.botsInfo);
                        continue;
                        gd3Var = gd3Var2;
                    case 482:
                        gd3Var2 = gd3Var;
                        if (this.mediaLocations == null) {
                            this.mediaLocations = new ChatMedia();
                        }
                        gd3Var2.j(this.mediaLocations);
                        continue;
                        gd3Var = gd3Var2;
                    case 496:
                        gd3Var2 = gd3Var;
                        this.modified = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 514:
                        gd3Var2 = gd3Var;
                        this.draft = gd3Var2.g();
                        continue;
                        gd3Var = gd3Var2;
                    case 520:
                        gd3Var2 = gd3Var;
                        this.draftUpdateTime = gd3Var2.q();
                        continue;
                        gd3Var = gd3Var2;
                    case 528:
                        gd3Var2 = gd3Var;
                        this.subscribedToUpdates = gd3Var2.f();
                        continue;
                        gd3Var = gd3Var2;
                    case 538:
                        gd3Var2 = gd3Var;
                        this.liveLocationMessageIds = kp7.b(gd3Var2, this.liveLocationMessageIds, tn8Var, 3, 3, null, 8, 16);
                        continue;
                        gd3Var = gd3Var2;
                    case 544:
                        this.lastMentionMessageId = gd3Var.q();
                        break;
                    case 552:
                        int iB6 = coi.b(gd3Var, 552);
                        long[] jArr5 = this.chatFoldersIds;
                        int length8 = jArr5 == null ? 0 : jArr5.length;
                        int i10 = iB6 + length8;
                        long[] jArr6 = new long[i10];
                        if (length8 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length8);
                        }
                        while (length8 < i10 - 1) {
                            jArr6[length8] = gd3Var.q();
                            gd3Var.s();
                            length8++;
                        }
                        jArr6[length8] = gd3Var.q();
                        this.chatFoldersIds = jArr6;
                        break;
                    case 554:
                        int iE3 = gd3Var.e(gd3Var.p());
                        int iC3 = gd3Var.c();
                        int i11 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.q();
                            i11++;
                        }
                        gd3Var.t(iC3);
                        long[] jArr7 = this.chatFoldersIds;
                        int length9 = jArr7 == null ? 0 : jArr7.length;
                        int i12 = i11 + length9;
                        long[] jArr8 = new long[i12];
                        if (length9 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length9);
                        }
                        while (length9 < i12) {
                            jArr8[length9] = gd3Var.q();
                            length9++;
                        }
                        this.chatFoldersIds = jArr8;
                        gd3Var.d(iE3);
                        break;
                    case 560:
                        this.draftUpdateTimeForSyncLogic = gd3Var.q();
                        break;
                    case 568:
                        this.markedAsUnread = gd3Var.f();
                        break;
                    case 578:
                        if (this.lastPushMessage == null) {
                            this.lastPushMessage = new PushMessage();
                        }
                        gd3Var.j(this.lastPushMessage);
                        break;
                    case 584:
                        this.lastReactedMessageId = gd3Var.q();
                        break;
                    case 594:
                        this.lastReaction = gd3Var.r();
                        break;
                    case 600:
                        this.lastFireDelayedErrorTime = gd3Var.q();
                        break;
                    case 608:
                        this.lastDelayedUpdateTime = gd3Var.q();
                        break;
                    case 618:
                        int iB7 = coi.b(gd3Var, 618);
                        Chunk[] chunkArr3 = this.delayedChunk;
                        int length10 = chunkArr3 == null ? 0 : chunkArr3.length;
                        int i13 = iB7 + length10;
                        Chunk[] chunkArr4 = new Chunk[i13];
                        if (length10 != 0) {
                            System.arraycopy(chunkArr3, 0, chunkArr4, 0, length10);
                        }
                        while (length10 < i13 - 1) {
                            Chunk chunk3 = new Chunk();
                            chunkArr4[length10] = chunk3;
                            gd3Var.j(chunk3);
                            gd3Var.s();
                            length10++;
                        }
                        Chunk chunk4 = new Chunk();
                        chunkArr4[length10] = chunk4;
                        gd3Var.j(chunk4);
                        this.delayedChunk = chunkArr4;
                        break;
                    case 626:
                        if (this.mediaAudioVideoMsg == null) {
                            this.mediaAudioVideoMsg = new ChatMedia();
                        }
                        gd3Var.j(this.mediaAudioVideoMsg);
                        break;
                    default:
                        if (!gd3Var.u(iS)) {
                            break;
                        }
                        break;
                }
                gd3Var2 = gd3Var;
                gd3Var = gd3Var2;
            }
            return this;
        }
    }

    public static final class Contact extends fl9 {
        public static final int BLOCKED = 1;
        public static final int BOT = 1;
        public static final int EXTERNAL = 1;
        public static final int FEMALE = 2;
        public static final int HAS_WEBAPP = 3;
        public static final int IS_NULL = 0;
        public static final int MALE = 1;
        public static final int NO_FORWARD = 5;
        public static final int OFFICIAL = 0;
        public static final int PortalStatus_BLOCKED = 0;
        public static final int PortalStatus_REMOVED = 1;
        public static final int REMOVED = 2;
        public static final int RESTRICTED = 4;
        public static final int SERVICE_ACCOUNT = 2;
        public static final int UNKNOWN = 0;
        public static final int USER_LIST = 0;
        private static volatile Contact[] _emptyArray;
        public String baseRawUrl;
        public String baseUrl;
        public String birthday;
        public String description;
        public String deviceAvatarUrl;
        public String deviceName;
        public int gender;
        public long lastSearchClickTime;
        public long lastShowingUnknownContactBar;
        public long lastSyncTime;
        public long lastUpdateTime;
        public String link;
        public MenuButton menuButton;
        public ContactName[] names;
        public int[] options;
        public long photoId;
        public int portalStatus;
        public int[] profileOptions;
        public long serverId;
        public long serverPhone;
        public int settings;
        public StartMessage startMessage;
        public int status;
        public int type;
        public long unbindOkPanelCloseTime;

        public static final class ContactName extends fl9 {
            public static final int CUSTOM = 1;
            public static final int DEVICE = 2;
            public static final int ONEME = 3;
            public static final int UNKNOWN = 0;
            private static volatile ContactName[] _emptyArray;
            public String lastName;
            public String name;
            public int type;

            public ContactName() {
                clear();
            }

            public static ContactName[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ContactName[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static ContactName parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ContactName) fl9.mergeFrom(new ContactName(), bArr);
            }

            public ContactName clear() {
                this.name = "";
                this.type = 0;
                this.lastName = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                int iL = !this.name.equals("") ? hd3.l(1, this.name) : 0;
                int i = this.type;
                if (i != 0) {
                    iL += hd3.f(2, i);
                }
                return !this.lastName.equals("") ? hd3.l(3, this.lastName) + iL : iL;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                if (!this.name.equals("")) {
                    hd3Var.E(1, this.name);
                }
                int i = this.type;
                if (i != 0) {
                    hd3Var.w(2, i);
                }
                if (this.lastName.equals("")) {
                    return;
                }
                hd3Var.E(3, this.lastName);
            }

            public static ContactName parseFrom(gd3 gd3Var) throws IOException {
                return new ContactName().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public ContactName mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.name = gd3Var.r();
                    } else if (iS == 16) {
                        int iP = gd3Var.p();
                        if (iP == 0 || iP == 1 || iP == 2 || iP == 3) {
                            this.type = iP;
                        }
                    } else if (iS == 26) {
                        this.lastName = gd3Var.r();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class MenuButton extends fl9 {
            private static volatile MenuButton[] _emptyArray;
            public String text;

            public MenuButton() {
                clear();
            }

            public static MenuButton[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MenuButton[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static MenuButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MenuButton) fl9.mergeFrom(new MenuButton(), bArr);
            }

            public MenuButton clear() {
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                if (this.text.equals("")) {
                    return 0;
                }
                return hd3.l(1, this.text);
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                if (this.text.equals("")) {
                    return;
                }
                hd3Var.E(1, this.text);
            }

            public static MenuButton parseFrom(gd3 gd3Var) throws IOException {
                return new MenuButton().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public MenuButton mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.text = gd3Var.r();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public static final class StartMessage extends fl9 {
            private static volatile StartMessage[] _emptyArray;
            public MessageElement[] elements;
            public Attaches.Attach media;
            public String text;

            public StartMessage() {
                clear();
            }

            public static StartMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new StartMessage[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static StartMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (StartMessage) fl9.mergeFrom(new StartMessage(), bArr);
            }

            public StartMessage clear() {
                this.media = null;
                this.text = "";
                this.elements = MessageElement.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                Attaches.Attach attach = this.media;
                int i = 0;
                int i2 = attach != null ? hd3.i(1, attach) : 0;
                if (!this.text.equals("")) {
                    i2 += hd3.l(2, this.text);
                }
                MessageElement[] messageElementArr = this.elements;
                if (messageElementArr != null && messageElementArr.length > 0) {
                    while (true) {
                        MessageElement[] messageElementArr2 = this.elements;
                        if (i >= messageElementArr2.length) {
                            break;
                        }
                        MessageElement messageElement = messageElementArr2[i];
                        if (messageElement != null) {
                            i2 = hd3.i(3, messageElement) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                Attaches.Attach attach = this.media;
                if (attach != null) {
                    hd3Var.y(1, attach);
                }
                if (!this.text.equals("")) {
                    hd3Var.E(2, this.text);
                }
                MessageElement[] messageElementArr = this.elements;
                if (messageElementArr == null || messageElementArr.length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    MessageElement[] messageElementArr2 = this.elements;
                    if (i >= messageElementArr2.length) {
                        return;
                    }
                    MessageElement messageElement = messageElementArr2[i];
                    if (messageElement != null) {
                        hd3Var.y(3, messageElement);
                    }
                    i++;
                }
            }

            public static StartMessage parseFrom(gd3 gd3Var) throws IOException {
                return new StartMessage().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public StartMessage mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        if (this.media == null) {
                            this.media = new Attaches.Attach();
                        }
                        gd3Var.j(this.media);
                    } else if (iS == 18) {
                        this.text = gd3Var.r();
                    } else if (iS == 26) {
                        int iB = coi.b(gd3Var, 26);
                        MessageElement[] messageElementArr = this.elements;
                        int length = messageElementArr == null ? 0 : messageElementArr.length;
                        int i = iB + length;
                        MessageElement[] messageElementArr2 = new MessageElement[i];
                        if (length != 0) {
                            System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                        }
                        while (length < i - 1) {
                            MessageElement messageElement = new MessageElement();
                            messageElementArr2[length] = messageElement;
                            gd3Var.j(messageElement);
                            gd3Var.s();
                            length++;
                        }
                        MessageElement messageElement2 = new MessageElement();
                        messageElementArr2[length] = messageElement2;
                        gd3Var.j(messageElement2);
                        this.elements = messageElementArr2;
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public Contact() {
            clear();
        }

        public static Contact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Contact[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Contact) fl9.mergeFrom(new Contact(), bArr);
        }

        public Contact clear() {
            this.serverId = 0L;
            this.deviceAvatarUrl = "";
            this.deviceName = "";
            this.lastUpdateTime = 0L;
            this.serverPhone = 0L;
            this.status = 0;
            this.type = 0;
            this.gender = 0;
            this.settings = 0;
            this.names = ContactName.emptyArray();
            int[] iArr = coi.a;
            this.options = iArr;
            this.description = "";
            this.link = "";
            this.birthday = "";
            this.photoId = 0L;
            this.baseUrl = "";
            this.baseRawUrl = "";
            this.unbindOkPanelCloseTime = 0L;
            this.lastSearchClickTime = 0L;
            this.lastSyncTime = 0L;
            this.lastShowingUnknownContactBar = 0L;
            this.portalStatus = 0;
            this.menuButton = null;
            this.profileOptions = iArr;
            this.startMessage = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            int[] iArr;
            int[] iArr2;
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.deviceAvatarUrl.equals("")) {
                iH += hd3.l(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                iH += hd3.l(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                iH += hd3.h(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                iH += hd3.h(9, j3);
            }
            int i2 = this.status;
            if (i2 != 0) {
                iH += hd3.f(10, i2);
            }
            int i3 = this.type;
            if (i3 != 0) {
                iH += hd3.f(11, i3);
            }
            int i4 = this.gender;
            if (i4 != 0) {
                iH += hd3.f(12, i4);
            }
            int i5 = this.settings;
            if (i5 != 0) {
                iH += hd3.f(13, i5);
            }
            ContactName[] contactNameArr = this.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        iH = hd3.i(14, contactName) + iH;
                    }
                    i6++;
                }
            }
            int[] iArr3 = this.options;
            if (iArr3 != null && iArr3.length > 0) {
                int i7 = 0;
                int iG = 0;
                while (true) {
                    iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    iG += hd3.g(iArr2[i7]);
                    i7++;
                }
                iH = iH + iG + iArr2.length;
            }
            if (!this.description.equals("")) {
                iH += hd3.l(16, this.description);
            }
            if (!this.link.equals("")) {
                iH += hd3.l(17, this.link);
            }
            if (!this.birthday.equals("")) {
                iH += hd3.l(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                iH += hd3.h(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                iH += hd3.l(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                iH += hd3.l(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                iH += hd3.h(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                iH += hd3.h(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                iH += hd3.h(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                iH += hd3.h(25, j8);
            }
            int i8 = this.portalStatus;
            if (i8 != 0) {
                iH += hd3.f(27, i8);
            }
            MenuButton menuButton = this.menuButton;
            if (menuButton != null) {
                iH += hd3.i(28, menuButton);
            }
            int[] iArr4 = this.profileOptions;
            if (iArr4 != null && iArr4.length > 0) {
                int iG2 = 0;
                while (true) {
                    iArr = this.profileOptions;
                    if (i >= iArr.length) {
                        break;
                    }
                    iG2 += hd3.g(iArr[i]);
                    i++;
                }
                iH = iH + iG2 + (iArr.length * 2);
            }
            StartMessage startMessage = this.startMessage;
            return startMessage != null ? hd3.i(30, startMessage) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.deviceAvatarUrl.equals("")) {
                hd3Var.E(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                hd3Var.E(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                hd3Var.x(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                hd3Var.x(9, j3);
            }
            int i = this.status;
            if (i != 0) {
                hd3Var.w(10, i);
            }
            int i2 = this.type;
            if (i2 != 0) {
                hd3Var.w(11, i2);
            }
            int i3 = this.gender;
            if (i3 != 0) {
                hd3Var.w(12, i3);
            }
            int i4 = this.settings;
            if (i4 != 0) {
                hd3Var.w(13, i4);
            }
            ContactName[] contactNameArr = this.names;
            int i5 = 0;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        hd3Var.y(14, contactName);
                    }
                    i6++;
                }
            }
            int[] iArr = this.options;
            if (iArr != null && iArr.length > 0) {
                int i7 = 0;
                while (true) {
                    int[] iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    hd3Var.w(15, iArr2[i7]);
                    i7++;
                }
            }
            if (!this.description.equals("")) {
                hd3Var.E(16, this.description);
            }
            if (!this.link.equals("")) {
                hd3Var.E(17, this.link);
            }
            if (!this.birthday.equals("")) {
                hd3Var.E(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                hd3Var.x(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                hd3Var.E(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                hd3Var.E(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                hd3Var.x(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                hd3Var.x(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                hd3Var.x(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                hd3Var.x(25, j8);
            }
            int i8 = this.portalStatus;
            if (i8 != 0) {
                hd3Var.w(27, i8);
            }
            MenuButton menuButton = this.menuButton;
            if (menuButton != null) {
                hd3Var.y(28, menuButton);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.profileOptions;
                    if (i5 >= iArr4.length) {
                        break;
                    }
                    hd3Var.w(29, iArr4[i5]);
                    i5++;
                }
            }
            StartMessage startMessage = this.startMessage;
            if (startMessage != null) {
                hd3Var.y(30, startMessage);
            }
        }

        public static Contact parseFrom(gd3 gd3Var) throws IOException {
            return new Contact().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public Contact mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                switch (iS) {
                    case 0:
                        break;
                    case 8:
                        this.serverId = gd3Var.q();
                        break;
                    case 34:
                        this.deviceAvatarUrl = gd3Var.r();
                        break;
                    case 50:
                        this.deviceName = gd3Var.r();
                        break;
                    case EglBase.EGL_OPENGL_ES3_BIT /* 64 */:
                        this.lastUpdateTime = gd3Var.q();
                        break;
                    case 72:
                        this.serverPhone = gd3Var.q();
                        break;
                    case 80:
                        int iP = gd3Var.p();
                        if (iP != 0 && iP != 1 && iP != 2) {
                            break;
                        } else {
                            this.status = iP;
                            break;
                        }
                        break;
                    case 88:
                        int iP2 = gd3Var.p();
                        if (iP2 != 0 && iP2 != 1) {
                            break;
                        } else {
                            this.type = iP2;
                            break;
                        }
                        break;
                    case 96:
                        int iP3 = gd3Var.p();
                        if (iP3 != 0 && iP3 != 1 && iP3 != 2) {
                            break;
                        } else {
                            this.gender = iP3;
                            break;
                        }
                    case 104:
                        this.settings = gd3Var.p();
                        break;
                    case 114:
                        int iB = coi.b(gd3Var, 114);
                        ContactName[] contactNameArr = this.names;
                        int length = contactNameArr == null ? 0 : contactNameArr.length;
                        int i = iB + length;
                        ContactName[] contactNameArr2 = new ContactName[i];
                        if (length != 0) {
                            System.arraycopy(contactNameArr, 0, contactNameArr2, 0, length);
                        }
                        while (length < i - 1) {
                            ContactName contactName = new ContactName();
                            contactNameArr2[length] = contactName;
                            gd3Var.j(contactName);
                            gd3Var.s();
                            length++;
                        }
                        ContactName contactName2 = new ContactName();
                        contactNameArr2[length] = contactName2;
                        gd3Var.j(contactName2);
                        this.names = contactNameArr2;
                        break;
                    case 120:
                        int iB2 = coi.b(gd3Var, 120);
                        int[] iArr = new int[iB2];
                        int i2 = 0;
                        for (int i3 = 0; i3 < iB2; i3++) {
                            if (i3 != 0) {
                                gd3Var.s();
                            }
                            int iP4 = gd3Var.p();
                            if (iP4 == 0 || iP4 == 1 || iP4 == 2 || iP4 == 3 || iP4 == 4 || iP4 == 5) {
                                iArr[i2] = iP4;
                                i2++;
                            }
                        }
                        if (i2 == 0) {
                            break;
                        } else {
                            int[] iArr2 = this.options;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 != 0 || i2 != iB2) {
                                int[] iArr3 = new int[length2 + i2];
                                if (length2 != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i2);
                                this.options = iArr3;
                                break;
                            } else {
                                this.options = iArr;
                                break;
                            }
                        }
                    case 122:
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i4 = 0;
                        while (gd3Var.b() > 0) {
                            int iP5 = gd3Var.p();
                            if (iP5 == 0 || iP5 == 1 || iP5 == 2 || iP5 == 3 || iP5 == 4 || iP5 == 5) {
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            gd3Var.t(iC);
                            int[] iArr4 = this.options;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[i4 + length3];
                            if (length3 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length3);
                            }
                            while (gd3Var.b() > 0) {
                                int iP6 = gd3Var.p();
                                if (iP6 == 0 || iP6 == 1 || iP6 == 2 || iP6 == 3 || iP6 == 4 || iP6 == 5) {
                                    iArr5[length3] = iP6;
                                    length3++;
                                }
                            }
                            this.options = iArr5;
                        }
                        gd3Var.d(iE);
                        break;
                    case 130:
                        this.description = gd3Var.r();
                        break;
                    case 138:
                        this.link = gd3Var.r();
                        break;
                    case 146:
                        this.birthday = gd3Var.r();
                        break;
                    case 152:
                        this.photoId = gd3Var.q();
                        break;
                    case 162:
                        this.baseUrl = gd3Var.r();
                        break;
                    case 170:
                        this.baseRawUrl = gd3Var.r();
                        break;
                    case 176:
                        this.unbindOkPanelCloseTime = gd3Var.q();
                        break;
                    case 184:
                        this.lastSearchClickTime = gd3Var.q();
                        break;
                    case 192:
                        this.lastSyncTime = gd3Var.q();
                        break;
                    case 200:
                        this.lastShowingUnknownContactBar = gd3Var.q();
                        break;
                    case 216:
                        int iP7 = gd3Var.p();
                        if (iP7 != 0 && iP7 != 1) {
                            break;
                        } else {
                            this.portalStatus = iP7;
                            break;
                        }
                    case 226:
                        if (this.menuButton == null) {
                            this.menuButton = new MenuButton();
                        }
                        gd3Var.j(this.menuButton);
                        break;
                    case 232:
                        int iB3 = coi.b(gd3Var, 232);
                        int[] iArr6 = this.profileOptions;
                        int length4 = iArr6 == null ? 0 : iArr6.length;
                        int i5 = iB3 + length4;
                        int[] iArr7 = new int[i5];
                        if (length4 != 0) {
                            System.arraycopy(iArr6, 0, iArr7, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            iArr7[length4] = gd3Var.p();
                            gd3Var.s();
                            length4++;
                        }
                        iArr7[length4] = gd3Var.p();
                        this.profileOptions = iArr7;
                        break;
                    case 234:
                        int iE2 = gd3Var.e(gd3Var.p());
                        int iC2 = gd3Var.c();
                        int i6 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.p();
                            i6++;
                        }
                        gd3Var.t(iC2);
                        int[] iArr8 = this.profileOptions;
                        int length5 = iArr8 == null ? 0 : iArr8.length;
                        int i7 = i6 + length5;
                        int[] iArr9 = new int[i7];
                        if (length5 != 0) {
                            System.arraycopy(iArr8, 0, iArr9, 0, length5);
                        }
                        while (length5 < i7) {
                            iArr9[length5] = gd3Var.p();
                            length5++;
                        }
                        this.profileOptions = iArr9;
                        gd3Var.d(iE2);
                        break;
                    case 242:
                        if (this.startMessage == null) {
                            this.startMessage = new StartMessage();
                        }
                        gd3Var.j(this.startMessage);
                        break;
                    default:
                        if (gd3Var.u(iS)) {
                            break;
                        } else {
                            break;
                        }
                }
            }
            return this;
        }
    }

    public static final class LogEvent extends fl9 {
        private static volatile LogEvent[] _emptyArray;
        public String event;
        public byte[] params;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public LogEvent() {
            clear();
        }

        public static LogEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LogEvent[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LogEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LogEvent) fl9.mergeFrom(new LogEvent(), bArr);
        }

        public LogEvent clear() {
            this.time = 0L;
            this.type = "";
            this.event = "";
            this.params = coi.e;
            this.userId = 0L;
            this.sessionId = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.time;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.type.equals("")) {
                iH += hd3.l(2, this.type);
            }
            if (!this.event.equals("")) {
                iH += hd3.l(3, this.event);
            }
            if (!Arrays.equals(this.params, coi.e)) {
                iH += hd3.b(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                iH += hd3.h(5, j2);
            }
            long j3 = this.sessionId;
            return j3 != 0 ? hd3.h(6, j3) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.time;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.type.equals("")) {
                hd3Var.E(2, this.type);
            }
            if (!this.event.equals("")) {
                hd3Var.E(3, this.event);
            }
            if (!Arrays.equals(this.params, coi.e)) {
                hd3Var.s(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                hd3Var.x(5, j2);
            }
            long j3 = this.sessionId;
            if (j3 != 0) {
                hd3Var.x(6, j3);
            }
        }

        public static LogEvent parseFrom(gd3 gd3Var) throws IOException {
            return new LogEvent().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public LogEvent mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.time = gd3Var.q();
                } else if (iS == 18) {
                    this.type = gd3Var.r();
                } else if (iS == 26) {
                    this.event = gd3Var.r();
                } else if (iS == 34) {
                    this.params = gd3Var.g();
                } else if (iS == 40) {
                    this.userId = gd3Var.q();
                } else if (iS == 48) {
                    this.sessionId = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class LongList extends fl9 {
        private static volatile LongList[] _emptyArray;
        public long[] value;

        public LongList() {
            clear();
        }

        public static LongList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LongList[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static LongList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LongList) fl9.mergeFrom(new LongList(), bArr);
        }

        public LongList clear() {
            this.value = coi.b;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long[] jArr = this.value;
            int i = 0;
            if (jArr == null || jArr.length <= 0) {
                return 0;
            }
            int iK = 0;
            while (true) {
                long[] jArr2 = this.value;
                if (i >= jArr2.length) {
                    return iK + jArr2.length;
                }
                iK += hd3.k(jArr2[i]);
                i++;
            }
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long[] jArr = this.value;
            if (jArr == null || jArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                long[] jArr2 = this.value;
                if (i >= jArr2.length) {
                    return;
                }
                hd3Var.x(1, jArr2[i]);
                i++;
            }
        }

        public static LongList parseFrom(gd3 gd3Var) throws IOException {
            return new LongList().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public LongList mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    int iB = coi.b(gd3Var, 8);
                    long[] jArr = this.value;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = iB + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = gd3Var.q();
                        gd3Var.s();
                        length++;
                    }
                    jArr2[length] = gd3Var.q();
                    this.value = jArr2;
                } else if (iS == 10) {
                    int iE = gd3Var.e(gd3Var.p());
                    int iC = gd3Var.c();
                    int i2 = 0;
                    while (gd3Var.b() > 0) {
                        gd3Var.q();
                        i2++;
                    }
                    gd3Var.t(iC);
                    long[] jArr3 = this.value;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = gd3Var.q();
                        length2++;
                    }
                    this.value = jArr4;
                    gd3Var.d(iE);
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MessageElement extends fl9 {
        public static final int ANIMOJI = 10;
        public static final int CODE = 9;
        public static final int EMPHASIZED = 4;
        public static final int GROUP_MENTION = 1;
        public static final int HEADING = 8;
        public static final int LINK = 5;
        public static final int MONOSPACED = 3;
        public static final int QUOTE = 11;
        public static final int STRIKETHROUGH = 6;
        public static final int STRONG = 2;
        public static final int UNDERLINE = 7;
        public static final int USER_MENTION = 0;
        private static volatile MessageElement[] _emptyArray;
        public long entityId;
        public String entityName;
        public int from;
        public int length;
        public LinkAttributes linkAttributes;
        public int type;

        public static final class LinkAttributes extends fl9 {
            private static volatile LinkAttributes[] _emptyArray;
            public String url;

            public LinkAttributes() {
                clear();
            }

            public static LinkAttributes[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (kp7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LinkAttributes[0];
                            }
                        } finally {
                        }
                    }
                }
                return _emptyArray;
            }

            public static LinkAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LinkAttributes) fl9.mergeFrom(new LinkAttributes(), bArr);
            }

            public LinkAttributes clear() {
                this.url = "";
                this.cachedSize = -1;
                return this;
            }

            @Override // defpackage.fl9
            public int computeSerializedSize() {
                if (this.url.equals("")) {
                    return 0;
                }
                return hd3.l(1, this.url);
            }

            @Override // defpackage.fl9
            public void writeTo(hd3 hd3Var) throws IOException {
                if (this.url.equals("")) {
                    return;
                }
                hd3Var.E(1, this.url);
            }

            public static LinkAttributes parseFrom(gd3 gd3Var) throws IOException {
                return new LinkAttributes().mergeFrom(gd3Var);
            }

            @Override // defpackage.fl9
            public LinkAttributes mergeFrom(gd3 gd3Var) throws IOException {
                while (true) {
                    int iS = gd3Var.s();
                    if (iS == 0) {
                        break;
                    }
                    if (iS == 10) {
                        this.url = gd3Var.r();
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                }
                return this;
            }
        }

        public MessageElement() {
            clear();
        }

        public static MessageElement[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElement[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElement parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElement) fl9.mergeFrom(new MessageElement(), bArr);
        }

        public MessageElement clear() {
            this.entityId = 0L;
            this.entityName = "";
            this.type = 0;
            this.from = 0;
            this.length = 0;
            this.linkAttributes = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.entityId;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            if (!this.entityName.equals("")) {
                iH += hd3.l(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                iH += hd3.f(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                iH += hd3.f(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                iH += hd3.f(5, i3);
            }
            LinkAttributes linkAttributes = this.linkAttributes;
            return linkAttributes != null ? hd3.i(6, linkAttributes) + iH : iH;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.entityId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            if (!this.entityName.equals("")) {
                hd3Var.E(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                hd3Var.w(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                hd3Var.w(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                hd3Var.w(5, i3);
            }
            LinkAttributes linkAttributes = this.linkAttributes;
            if (linkAttributes != null) {
                hd3Var.y(6, linkAttributes);
            }
        }

        public static MessageElement parseFrom(gd3 gd3Var) throws IOException {
            return new MessageElement().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MessageElement mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS != 0) {
                    if (iS == 8) {
                        this.entityId = gd3Var.q();
                    } else if (iS == 18) {
                        this.entityName = gd3Var.r();
                    } else if (iS == 24) {
                        int iP = gd3Var.p();
                        switch (iP) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                this.type = iP;
                                break;
                        }
                    } else if (iS == 32) {
                        this.from = gd3Var.p();
                    } else if (iS == 40) {
                        this.length = gd3Var.p();
                    } else if (iS == 50) {
                        if (this.linkAttributes == null) {
                            this.linkAttributes = new LinkAttributes();
                        }
                        gd3Var.j(this.linkAttributes);
                    } else if (!gd3Var.u(iS)) {
                    }
                }
            }
            return this;
        }
    }

    public static final class MessageElements extends fl9 {
        private static volatile MessageElements[] _emptyArray;
        public MessageElement[] elements;

        public MessageElements() {
            clear();
        }

        public static MessageElements[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElements[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElements parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElements) fl9.mergeFrom(new MessageElements(), bArr);
        }

        public MessageElements clear() {
            this.elements = MessageElement.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            MessageElement[] messageElementArr = this.elements;
            int i = 0;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return i2;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    i2 = hd3.i(1, messageElement) + i2;
                }
                i++;
            }
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            MessageElement[] messageElementArr = this.elements;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    hd3Var.y(1, messageElement);
                }
                i++;
            }
        }

        public static MessageElements parseFrom(gd3 gd3Var) throws IOException {
            return new MessageElements().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MessageElements mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    int iB = coi.b(gd3Var, 10);
                    MessageElement[] messageElementArr = this.elements;
                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                    int i = iB + length;
                    MessageElement[] messageElementArr2 = new MessageElement[i];
                    if (length != 0) {
                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageElement messageElement = new MessageElement();
                        messageElementArr2[length] = messageElement;
                        gd3Var.j(messageElement);
                        gd3Var.s();
                        length++;
                    }
                    MessageElement messageElement2 = new MessageElement();
                    messageElementArr2[length] = messageElement2;
                    gd3Var.j(messageElement2);
                    this.elements = messageElementArr2;
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MessagePreview extends fl9 {
        private static volatile MessagePreview[] _emptyArray;
        public Attaches attaches;
        public String text;

        public MessagePreview() {
            clear();
        }

        public static MessagePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessagePreview[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessagePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessagePreview) fl9.mergeFrom(new MessagePreview(), bArr);
        }

        public MessagePreview clear() {
            this.text = "";
            this.attaches = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            int iL = !this.text.equals("") ? hd3.l(1, this.text) : 0;
            Attaches attaches = this.attaches;
            return attaches != null ? hd3.i(2, attaches) + iL : iL;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            if (!this.text.equals("")) {
                hd3Var.E(1, this.text);
            }
            Attaches attaches = this.attaches;
            if (attaches != null) {
                hd3Var.y(2, attaches);
            }
        }

        public static MessagePreview parseFrom(gd3 gd3Var) throws IOException {
            return new MessagePreview().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MessagePreview mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    this.text = gd3Var.r();
                } else if (iS == 18) {
                    if (this.attaches == null) {
                        this.attaches = new Attaches();
                    }
                    gd3Var.j(this.attaches);
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MessageReactionWithCount extends fl9 {
        private static volatile MessageReactionWithCount[] _emptyArray;
        public int count;
        public ReactionData reaction;

        public MessageReactionWithCount() {
            clear();
        }

        public static MessageReactionWithCount[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactionWithCount[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactionWithCount parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactionWithCount) fl9.mergeFrom(new MessageReactionWithCount(), bArr);
        }

        public MessageReactionWithCount clear() {
            this.reaction = null;
            this.count = 0;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            ReactionData reactionData = this.reaction;
            int i = reactionData != null ? hd3.i(1, reactionData) : 0;
            int i2 = this.count;
            return i2 != 0 ? hd3.f(2, i2) + i : i;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            ReactionData reactionData = this.reaction;
            if (reactionData != null) {
                hd3Var.y(1, reactionData);
            }
            int i = this.count;
            if (i != 0) {
                hd3Var.w(2, i);
            }
        }

        public static MessageReactionWithCount parseFrom(gd3 gd3Var) throws IOException {
            return new MessageReactionWithCount().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MessageReactionWithCount mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    if (this.reaction == null) {
                        this.reaction = new ReactionData();
                    }
                    gd3Var.j(this.reaction);
                } else if (iS == 16) {
                    this.count = gd3Var.p();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class MessageReactions extends fl9 {
        private static volatile MessageReactions[] _emptyArray;
        public MessageReactionWithCount[] reactions;
        public int totalCount;
        public ReactionData yourReaction;

        public MessageReactions() {
            clear();
        }

        public static MessageReactions[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactions[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactions) fl9.mergeFrom(new MessageReactions(), bArr);
        }

        public MessageReactions clear() {
            this.reactions = MessageReactionWithCount.emptyArray();
            this.totalCount = 0;
            this.yourReaction = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            int iF = 0;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (iF >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[iF];
                    if (messageReactionWithCount != null) {
                        i = hd3.i(1, messageReactionWithCount) + i;
                    }
                    iF++;
                }
                iF = i;
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                iF += hd3.f(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            return reactionData != null ? hd3.i(3, reactionData) + iF : iF;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (i >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[i];
                    if (messageReactionWithCount != null) {
                        hd3Var.y(1, messageReactionWithCount);
                    }
                    i++;
                }
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                hd3Var.w(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            if (reactionData != null) {
                hd3Var.y(3, reactionData);
            }
        }

        public static MessageReactions parseFrom(gd3 gd3Var) throws IOException {
            return new MessageReactions().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public MessageReactions mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    int iB = coi.b(gd3Var, 10);
                    MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
                    int length = messageReactionWithCountArr == null ? 0 : messageReactionWithCountArr.length;
                    int i = iB + length;
                    MessageReactionWithCount[] messageReactionWithCountArr2 = new MessageReactionWithCount[i];
                    if (length != 0) {
                        System.arraycopy(messageReactionWithCountArr, 0, messageReactionWithCountArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageReactionWithCount messageReactionWithCount = new MessageReactionWithCount();
                        messageReactionWithCountArr2[length] = messageReactionWithCount;
                        gd3Var.j(messageReactionWithCount);
                        gd3Var.s();
                        length++;
                    }
                    MessageReactionWithCount messageReactionWithCount2 = new MessageReactionWithCount();
                    messageReactionWithCountArr2[length] = messageReactionWithCount2;
                    gd3Var.j(messageReactionWithCount2);
                    this.reactions = messageReactionWithCountArr2;
                } else if (iS == 16) {
                    this.totalCount = gd3Var.p();
                } else if (iS == 26) {
                    if (this.yourReaction == null) {
                        this.yourReaction = new ReactionData();
                    }
                    gd3Var.j(this.yourReaction);
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class PendingUploadData extends fl9 {
        private static volatile PendingUploadData[] _emptyArray;
        public Map<Long, String> pendingMap;

        public PendingUploadData() {
            clear();
        }

        public static PendingUploadData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PendingUploadData[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static PendingUploadData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PendingUploadData) fl9.mergeFrom(new PendingUploadData(), bArr);
        }

        public PendingUploadData clear() {
            this.pendingMap = null;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                return kp7.a(map, 1, 3, 9);
            }
            return 0;
        }

        @Override // defpackage.fl9
        public PendingUploadData mergeFrom(gd3 gd3Var) throws IOException {
            gd3 gd3Var2;
            tn8 tn8Var = jei.a;
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 10) {
                    gd3Var2 = gd3Var;
                    this.pendingMap = kp7.b(gd3Var2, this.pendingMap, tn8Var, 3, 9, null, 8, 18);
                } else {
                    if (!gd3Var.u(iS)) {
                        break;
                    }
                    gd3Var2 = gd3Var;
                }
                gd3Var = gd3Var2;
            }
            return this;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                kp7.d(hd3Var, map, 1, 3, 9);
            }
        }

        public static PendingUploadData parseFrom(gd3 gd3Var) throws IOException {
            return new PendingUploadData().mergeFrom(gd3Var);
        }
    }

    public static final class ReactionData extends fl9 {
        public static final int EMOJI = 0;
        public static final int STICKER = 1;
        private static volatile ReactionData[] _emptyArray;
        public String reaction;
        public int type;

        public ReactionData() {
            clear();
        }

        public static ReactionData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ReactionData[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static ReactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ReactionData) fl9.mergeFrom(new ReactionData(), bArr);
        }

        public ReactionData clear() {
            this.type = 0;
            this.reaction = "";
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            int i = this.type;
            int iF = i != 0 ? hd3.f(1, i) : 0;
            return !this.reaction.equals("") ? hd3.l(2, this.reaction) + iF : iF;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            int i = this.type;
            if (i != 0) {
                hd3Var.w(1, i);
            }
            if (this.reaction.equals("")) {
                return;
            }
            hd3Var.E(2, this.reaction);
        }

        public static ReactionData parseFrom(gd3 gd3Var) throws IOException {
            return new ReactionData().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public ReactionData mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    int iP = gd3Var.p();
                    if (iP == 0 || iP == 1) {
                        this.type = iP;
                    }
                } else if (iS == 18) {
                    this.reaction = gd3Var.r();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class RestrictionsInfo extends fl9 {
        private static volatile RestrictionsInfo[] _emptyArray;
        public long expiration;

        public RestrictionsInfo() {
            clear();
        }

        public static RestrictionsInfo[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new RestrictionsInfo[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static RestrictionsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (RestrictionsInfo) fl9.mergeFrom(new RestrictionsInfo(), bArr);
        }

        public RestrictionsInfo clear() {
            this.expiration = 0L;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.expiration;
            if (j != 0) {
                return hd3.h(1, j);
            }
            return 0;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.expiration;
            if (j != 0) {
                hd3Var.x(1, j);
            }
        }

        public static RestrictionsInfo parseFrom(gd3 gd3Var) throws IOException {
            return new RestrictionsInfo().mergeFrom(gd3Var);
        }

        @Override // defpackage.fl9
        public RestrictionsInfo mergeFrom(gd3 gd3Var) throws IOException {
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    this.expiration = gd3Var.q();
                } else if (!gd3Var.u(iS)) {
                    break;
                }
            }
            return this;
        }
    }

    public static final class SelfProfile extends fl9 {
        private static volatile SelfProfile[] _emptyArray;
        public int[] profileOptions;
        public Map<Integer, RestrictionsInfo> restrictions;
        public long serverId;

        public SelfProfile() {
            clear();
        }

        public static SelfProfile[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (kp7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new SelfProfile[0];
                        }
                    } finally {
                    }
                }
            }
            return _emptyArray;
        }

        public static SelfProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (SelfProfile) fl9.mergeFrom(new SelfProfile(), bArr);
        }

        public SelfProfile clear() {
            this.serverId = 0L;
            this.restrictions = null;
            this.profileOptions = coi.a;
            this.cachedSize = -1;
            return this;
        }

        @Override // defpackage.fl9
        public int computeSerializedSize() {
            long j = this.serverId;
            int i = 0;
            int iH = j != 0 ? hd3.h(1, j) : 0;
            Map<Integer, RestrictionsInfo> map = this.restrictions;
            if (map != null) {
                iH += kp7.a(map, 2, 5, 11);
            }
            int[] iArr = this.profileOptions;
            if (iArr == null || iArr.length <= 0) {
                return iH;
            }
            int iG = 0;
            while (true) {
                int[] iArr2 = this.profileOptions;
                if (i >= iArr2.length) {
                    return iH + iG + iArr2.length;
                }
                iG += hd3.g(iArr2[i]);
                i++;
            }
        }

        @Override // defpackage.fl9
        public SelfProfile mergeFrom(gd3 gd3Var) throws IOException {
            gd3 gd3Var2;
            tn8 tn8Var = jei.a;
            while (true) {
                int iS = gd3Var.s();
                if (iS == 0) {
                    break;
                }
                if (iS == 8) {
                    gd3Var2 = gd3Var;
                    this.serverId = gd3Var2.q();
                } else if (iS != 18) {
                    if (iS == 24) {
                        int iB = coi.b(gd3Var, 24);
                        int[] iArr = this.profileOptions;
                        int length = iArr == null ? 0 : iArr.length;
                        int i = iB + length;
                        int[] iArr2 = new int[i];
                        if (length != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length);
                        }
                        while (length < i - 1) {
                            iArr2[length] = gd3Var.p();
                            gd3Var.s();
                            length++;
                        }
                        iArr2[length] = gd3Var.p();
                        this.profileOptions = iArr2;
                    } else if (iS == 26) {
                        int iE = gd3Var.e(gd3Var.p());
                        int iC = gd3Var.c();
                        int i2 = 0;
                        while (gd3Var.b() > 0) {
                            gd3Var.p();
                            i2++;
                        }
                        gd3Var.t(iC);
                        int[] iArr3 = this.profileOptions;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int i3 = i2 + length2;
                        int[] iArr4 = new int[i3];
                        if (length2 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            iArr4[length2] = gd3Var.p();
                            length2++;
                        }
                        this.profileOptions = iArr4;
                        gd3Var.d(iE);
                    } else if (!gd3Var.u(iS)) {
                        break;
                    }
                    gd3Var2 = gd3Var;
                } else {
                    gd3Var2 = gd3Var;
                    this.restrictions = kp7.b(gd3Var2, this.restrictions, tn8Var, 5, 11, new RestrictionsInfo(), 8, 18);
                }
                gd3Var = gd3Var2;
            }
            return this;
        }

        @Override // defpackage.fl9
        public void writeTo(hd3 hd3Var) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                hd3Var.x(1, j);
            }
            Map<Integer, RestrictionsInfo> map = this.restrictions;
            if (map != null) {
                kp7.d(hd3Var, map, 2, 5, 11);
            }
            int[] iArr = this.profileOptions;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int[] iArr2 = this.profileOptions;
                if (i >= iArr2.length) {
                    return;
                }
                hd3Var.w(3, iArr2[i]);
                i++;
            }
        }

        public static SelfProfile parseFrom(gd3 gd3Var) throws IOException {
            return new SelfProfile().mergeFrom(gd3Var);
        }
    }
}
